
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object bootSearch extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(topics: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.24*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
    <html>
        """),_display_(/*4.10*/bootLayout("")/*4.24*/{_display_(Seq[Any](format.raw/*4.25*/("""
            """),format.raw/*5.13*/("""<div class="row">
                <div class="jumbotron-fluid jumbotron-paper container-fluid">
                    <div>
                        <h4 class="display-4 p-4 ml-4">Find papers here!</h4>
                    </div>
                </div>
            </div>
            <div class="container">
                <div class="row p-4">
                    <form action=""""),_display_(/*14.36*/routes/*14.42*/.PapersController.searchHandler()),format.raw/*14.75*/("""" method="GET">
                        <div class="col-md-12 offset-6">
                                <div class="form-group row mt-4">
                                    <label for="title" class="col-md-2">Title</label>
                                    <div class="col-md-10">
                                        <input id="title" name="title" type="text" class="form-control">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label for="author" class="col-md-2">Author</label>
                                    <div class="col-md-10">
                                        <input id="author" name="author" type="text" class="form-control">
                                    </div>
                                </div>
                            """),_display_(/*28.30*/for(topic <- topics) yield /*28.50*/{_display_(Seq[Any](format.raw/*28.51*/("""
                                """),format.raw/*29.33*/("""<div class="form-group form-check mt-0 mb-1 ml-2">
                                    <input id="topic" name="topic" type="checkbox" class="form-check-input" value=""""),_display_(/*30.117*/topic),format.raw/*30.122*/("""">
                                    <label for="topic" class="form-check-label form-control-sm">"""),_display_(/*31.98*/topic),format.raw/*31.103*/("""</label>
                                </div>
                            """)))}),format.raw/*33.30*/("""
                            """),format.raw/*34.29*/("""<button type="submit" class="btn btn-warning btn-block mt-3"><small>Search</small></button>
                        </div>
                    </form>
                </div>
            </div>
        """)))}),format.raw/*39.10*/("""
    """),format.raw/*40.5*/("""</html>
    <!--
    <form action="routes.PapersController.searchHandler()" method="GET">
        <div class="row">
            <div class="input-field col-md-5">
                <label for="title">Title</label>
                <input id="title" name="title" type="text">
            </div>
        </div>
        <div class="row">
            <div class="input-field col-md-5">
                <label for="author">Author</label>
                <input id="author" name="author" type="text">
            </div>
        </div>
        <div class="row">
            <div class="col-xl-4">
                <label for="chemistry">Chemistry</label>
                <input id="chemistry" name="chemistry" type="checkbox">
            </div>
        </div>
        <div class="row">
            <div class="col-xl-4">
                <label for="biology">Biology</label>
                <input id="biology" name="biology" type="checkbox">
            </div>
        </div>
        <div class="row">
            <div class="col-xl-4">
                <label for="physics">Physics</label>
                <input id="physics" name="physics" type="checkbox">
            </div>
        </div>
        <div class="row">
            <a type="button" href="bootResults.scala.html" class="btn btn-info m-3 float-right">Submit</a>
        </div>
    </form>
    -->"""))
      }
    }
  }

  def render(topics:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(topics)

  def f:((List[String]) => play.twirl.api.HtmlFormat.Appendable) = (topics) => apply(topics)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-04-30T22:24:08.944
                  SOURCE: C:/Users/kiots/Documents/software/a-web-application/Frontend/app/views/bootSearch.scala.html
                  HASH: a995a0156237046b4d03f248dd765e3a06901086
                  MATRIX: 959->1|1076->23|1104->25|1168->63|1190->77|1228->78|1269->92|1683->479|1698->485|1752->518|2692->1431|2728->1451|2767->1452|2829->1486|3025->1654|3052->1659|3180->1760|3207->1765|3317->1844|3375->1874|3613->2081|3646->2087
                  LINES: 28->1|33->1|34->2|36->4|36->4|36->4|37->5|46->14|46->14|46->14|60->28|60->28|60->28|61->29|62->30|62->30|63->31|63->31|65->33|66->34|71->39|72->40
                  -- GENERATED --
              */
          