package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Paper;
import models.User;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class PapersController extends Controller {

    public Result search() {

        JsonNode req = request().body().asJson();

        String title = req.get("title").asText();
        String author = req.get("author").asText();
        String topic = req.get("topic").asText();

        if (title != "") {
            System.out.println("TITLE NOT NULL");
            System.out.println(title);
            return findByTitle(title);
        }
        else if(author != ""){
            System.out.println("AUTHOR NOT NULL");
            return findByAuthor(author);
        }
        else if(topic != ""){
            System.out.println("TOPIC NOT NULL");
            return findByTopic(topic);
        }
        else{
            return ok("no search result...");
        }
    }
    public Result findByTitle(String title){
        try {
            Paper paper = Paper.findByTitle(title);

            if (paper != null) {
                JsonNode jsonResult = Json.toJson(paper);
                System.out.println(jsonResult);
                return ok(jsonResult);
            } else {
                return ok("false");
            }
        } catch (Exception e) {
            return ok("false");
        }
    }

    public Result findByAuthor(String author){
        try {
            System.out.println(author);
            Paper paper = Paper.findByAuthor(author);

            if (paper != null) {
                JsonNode jsonResult = Json.toJson(paper);
                return ok(jsonResult);
            } else {
                return ok("false");
            }
        } catch (Exception e) {
            return ok("false");
        }
    }

    public Result findByTopic(String topic){
        try {
            System.out.println(topic);
            Paper paper = Paper.findByTopic(topic);

            if (paper != null) {
                JsonNode jsonResult = Json.toJson(paper);
                return ok(jsonResult);
            } else {
                return ok("false");
            }
        } catch (Exception e) {
            return ok("false");
        }
    }
}