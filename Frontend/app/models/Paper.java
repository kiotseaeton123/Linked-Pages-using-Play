package models;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Locale;
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
        return title.toLowerCase(Locale.ROOT);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author.toLowerCase(Locale.ROOT);
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date.toLowerCase(Locale.ROOT);
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTopic() {
        return topic.toLowerCase(Locale.ROOT);
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public CompletionStage<WSResponse> findSearch() {

        WSClient ws = play.test.WSTestClient.newClient(9005);
        //add username password
        WSRequest request = ws.url("http://localhost:9005/search");

        ObjectNode res = Json.newObject();
        res.put("title", this.title);
        res.put("author",this.author);
        res.put("topic", this.topic);

        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    System.out.println(r);
                    return r;
                });
    }

}
