package models;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import java.util.concurrent.CompletionStage;

public class Paper {

    private String title;
    private String author;
    private String date;
    private String topic;

    public Paper(){}

    public Paper(String title, String author, String date, String topic){
        this.title = title;
        this.author = author;
        this.date = date;
        this.topic = topic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopics(String topic) {
        this.topic = topic;
    }

    public CompletionStage<WSResponse> findSearch() {

        WSClient ws = play.test.WSTestClient.newClient(9005);
        //add username password
        WSRequest request = ws.url("http://localhost:9005/search");
        System.out.println("testing call request");
        ObjectNode res = Json.newObject();
        res.put("title", this.title);
        res.put("author",this.author);
        res.put("topic", this.topic);
        System.out.println("title:"+this.title +"author"+this.author+ "topic"+this.topic);
        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }

}
