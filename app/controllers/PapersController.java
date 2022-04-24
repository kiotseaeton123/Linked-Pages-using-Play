package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.CreatePaper;
import models.Paper;
import models.Search;
import models.SearchImplement;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.libs.Json;
import play.mvc.BodyParser;


public class PapersController extends Controller {

    //refer to search implementation
    static final Search search = new SearchImplement();

    //using public static members resulted in compilation error message: static java members belong to companion objects in scala
    public Result list() {
        return ok(Json.toJson(search.list()));
    }

    //Play: bodyParser interprets body of HTTP request
    //force use of JSON bodyParser
    @BodyParser.Of(BodyParser.Json.class)
    public Result create(Http.Request request) {
        JsonNode json = request.body().asJson();

        CreatePaper create_paper;
        try{
            create_paper = Json.fromJson(json, CreatePaper.class);
        }catch (RuntimeException e){
            return badRequest();
        }
        Paper paper = search.create(create_paper.title, create_paper.author);
        if(paper != null){
            return ok(Json.toJson(paper));
        }else{
            return internalServerError();
        }
    }

    public Result details(Long paper_id) {
        Paper paper = search.get(paper_id);
        if (paper != null) {
            return ok(Json.toJson(paper));
        } else {
            return notFound();
        }
    }

    public Result update(Long paper_id) {
        return status(NOT_IMPLEMENTED);
    }

    public Result delete(Long paper_id) {
        return status(NOT_IMPLEMENTED);
    }

}

