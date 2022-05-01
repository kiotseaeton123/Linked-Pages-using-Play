
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

object bootMain extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(topics: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.24*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    """),_display_(/*4.6*/bootLayout("")/*4.20*/ {_display_(Seq[Any](format.raw/*4.22*/("""
        """),format.raw/*5.9*/("""<main role="main">
            <div class="jumbotron jumbotron-main">
                <div class="row p-5">
                    <div class="col-md-12">
                        <h1 class="display-4">Linked Papers</h1>
                        <p class="lead">Welcome to Linked Papers</p>
                    </div>
                </div>
            </div>
            <div class="container-fluid">
                <div class="row p-5">
                    <div class="row">
                        <h5 class="display-4">
                            <div class="col-md-10">
                                <p class="mt-1 ml-4">
                                    Explore topics you are interested in
                                </p>
                            </div>
                        </h5>
                    </div>
                    <div class="row">
                        <div class="col-md-12">
                            <p class="display-5 font-weight-lighter mt-0 ml-4">SEARCH TOPICS</p>
                        </div>
                    </div>
                    <div class="row mt-0 ml-5">
                        <div class="row">
                            <div class="ml-0 col-md-12">
                                <div class="row">
                                    <form action=""""),_display_(/*34.52*/routes/*34.58*/.PapersController.searchTopic()),format.raw/*34.89*/("""" method="GET">
                                        <div class="row">
                                            """),_display_(/*36.46*/for(topic <- topics) yield /*36.66*/ {_display_(Seq[Any](format.raw/*36.68*/("""
                                                """),format.raw/*37.49*/("""<div class="col-md-2">
                                                    <div class="form-select">
                                                        <input id="topic" name="topic" class="invisible" value="""),_display_(/*39.113*/topic),format.raw/*39.118*/(""">
                                                        <button id="topic" class="btn btn-outline-secondary" type="submit">"""),_display_(/*40.125*/topic),format.raw/*40.130*/("""</button>
                                                    </div>
                                                </div>
                                            """)))}),format.raw/*43.46*/("""
                                        """),format.raw/*44.41*/("""</div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>
    """)))}),format.raw/*53.6*/("""
"""),format.raw/*54.1*/("""</html>
"""))
      }
    }
  }

  def render(topics:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(topics)

  def f:((List[String]) => play.twirl.api.HtmlFormat.Appendable) = (topics) => apply(topics)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-04-30T23:21:26.348
                  SOURCE: C:/Users/kiots/Documents/software/a-web-application/Frontend/app/views/bootMain.scala.html
                  HASH: d84022c6063e30255d012806cc606e816a0e4060
                  MATRIX: 957->1|1074->23|1102->25|1157->55|1179->69|1218->71|1254->81|2627->1427|2642->1433|2694->1464|2842->1585|2878->1605|2918->1607|2996->1657|3239->1872|3266->1877|3421->2004|3448->2009|3651->2181|3721->2223|4006->2478|4035->2480
                  LINES: 28->1|33->1|34->2|36->4|36->4|36->4|37->5|66->34|66->34|66->34|68->36|68->36|68->36|69->37|71->39|71->39|72->40|72->40|75->43|76->44|85->53|86->54
                  -- GENERATED --
              */
          