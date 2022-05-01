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
    public CompletionStage<Result> searchTopic(String topic) {
        Form<Paper> topicForm = formFactory.form(Paper.class).bindFromRequest();

        if (topicForm.hasErrors()) {
            return (CompletionStage<Result>) badRequest();  // send parameter like register so that user could know
        }
        return topicForm.get().findSearch().thenApplyAsync((WSResponse response) -> {
            if (response.getStatus() == 200 && response.asJson() != null) {
                System.out.println(response.asJson());
                session("title", topicForm.get().getTitle());
                session("author", topicForm.get().getAuthor());
                session("date", topicForm.get().getDate());
                session("topic", topicForm.get().getTopic());
                return ok(views.html.index.render("title:" + topicForm.get().getTitle()));
            } else {
                String message = "No Search Results...";
                return badRequest(views.html.index.render(message));
            }
        }, ec.current());
    }

    //    searchPage is called by bootMain.html; when search button on nav-bar is clicked, returns search page with form to input title/author/topic
    public Result searchPage() {
        return ok(views.html.bootSearch.render(topics));
    }

    public CompletionStage<Result> searchHandler() {
        Form<Paper> searchForm = formFactory.form(Paper.class).bindFromRequest();

        if (searchForm.hasErrors()) {
            return (CompletionStage<Result>) badRequest();  // send parameter like register so that user could know
        }
        return searchForm.get().findSearch().thenApplyAsync((WSResponse response) -> {
            if (response.getStatus() == 200 && response.asJson() != null) {

                System.out.println(response.asJson());

                JsonNode res = response.asJson();
                String title = res.get("title").asText();
                String author = res.get("author").asText();
                String date = res.get("date").asText();
                String topic = res.get("topic").asText();

                Paper result = new Paper();
                result.setTitle(title);
                result.setAuthor(author);
                result.setDate(date);
                result.setTopics(topic);

                return ok(views.html.bootResults.render(result));

            } else {
                System.out.println("RESPONSE: " + response);
                System.out.println(response.asJson());

                String message = "paper not found...";
                return badRequest(views.html.index.render(message));
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
