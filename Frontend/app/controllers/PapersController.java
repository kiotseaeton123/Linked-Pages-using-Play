package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.Paper;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.ws.WSResponse;
import views.html.*;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletionStage;

import javax.inject.Inject;
import java.util.concurrent.CompletionStage;

public class PapersController extends Controller {
    @Inject
    HttpExecutionContext ec;

    private FormFactory formFactory;
    //    paper topics available for search
    public static List<String> topics = Arrays.asList("Chemistry", "Biology", "Physics");

    @Inject
    public PapersController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    public Result index() {
        return ok(views.html.bootMain.render(topics));
    }

//    searchTopic is called by bootMain.html: click topic -> return associated papers
//    the parameter String topic is just for testing; actual implementation is passed thru topicForm
//    there is still a bug with the html syntax... but haven't found the right documentation for a button input in bootstrap
    public CompletionStage<Result> searchTopic() {
        Form<Paper> topicForm = formFactory.form(Paper.class).bindFromRequest();

        if (topicForm.hasErrors()) {
            return (CompletionStage<Result>) badRequest();  // send parameter like register so that user could know
        }
        return topicForm.get().findSearch().thenApplyAsync((WSResponse response) -> {
            if (response.getStatus() == 200 && response.asJson() != null) {
                return getResult(response);
            } else {
                String message = "No Search Results...";
                return ok(views.html.index.render(message));
            }
        }, ec.current());
    }

    private Result getResult(WSResponse response) {
        System.out.println(response.asJson());

        JsonNode res = response.asJson();
        String title = res.get("title").asText();
        String author = res.get("author").asText();
        String date = res.get("date").asText();
        String top = res.get("topic").asText();

        Paper result = new Paper();
        result.setTitle(title);
        result.setAuthor(author);
        result.setDate(date);
        result.setTopic(top);

        return ok(bootResults.render(result));
    }

    //    searchPage is called by bootMain.html; when search button on nav-bar is clicked, returns search page with form to input title/author/topic
    public Result searchPage() {
        return ok(views.html.bootSearch.render(topics));
    }

//    it seems that the bootstrap checkbox carries a boolean-false with it when checked...
//    so, when doing if(response.asJson.asBoolean), it prevents processing the result topic(a checkbox)
//    solution: instead of checking for response.asjson.asboolean==true, change error condition to 'not found' in backend
    public CompletionStage<Result> searchHandler() {
        Form<Paper> searchForm = formFactory.form(Paper.class).bindFromRequest();

        if (searchForm.hasErrors()) {
            return (CompletionStage<Result>) badRequest();  // send parameter like register so that user could know
        }
        return searchForm.get().findSearch().thenApplyAsync((WSResponse response) -> {
            if (response.getStatus() == 200 && response.asJson() != null && response.asJson().asText() != "not found") {

                return getResult(response);

            } else {
                System.out.println("RESPONSE: " + response);
                System.out.println(response.asJson());

                String message = "paper not found...";
                return ok(views.html.index.render(message));
            }
        }, ec.current());
    }

    /*SOME NAVIGATION BAR DIRECTIVES*/
    public Result renderSurprise() {
        return ok(views.html.progressComponent.render());
    }

    /*AN ACTION CALL FOR TESTING PURPOSES ONLY*/
    public Result testHandler() {
        Form<Paper> topicForm = formFactory.form(Paper.class).bindFromRequest();

        if (topicForm.hasErrors()) {
            return badRequest("cannot process form...");
        }
        if (topicForm.get() != null) {
            return ok(views.html.index.render("title: " + topicForm.get().getTitle()));
        } else {
            return ok(views.html.index.render("did not process topicform"));
        }
    }

}
