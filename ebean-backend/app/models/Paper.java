package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Paper extends Model {

    @Id
    public Long id;
    public String title;
    public String author;
    public String date;
    public String topic;

    public static Find<Long, Paper> find = new Find<Long, Paper>() {};

    public static Paper findByTitle(String title) {
        return Paper.find.where().eq("title", title).findUnique();
    }
    public static Paper findByAuthor(String author) {
        return Paper.find.where().eq("author", author).findUnique();
    }
    public static Paper findByTopic(String topic) {
        return Paper.find.where().eq("topic", topic).findUnique();
    }

}
