package models;

import java.util.*;
//import io.ebean.*;
//import javax.persistence.*;

//import play.data.format.*;
//import play.data.validation.*;

//@Entity ; Paper extends Model
public class Paper{ //extends Model
//    @Id
//    @Column(name="paper_id")
    public final Long paper_id;
//    @Column(name="title")
    public final String title;
//    @Column(name="author")
    public final String author;

    public Paper(Long paper_id, String title, String author){
        this.paper_id = paper_id;
        this.author = author;
        this.title = title;
    }
}
