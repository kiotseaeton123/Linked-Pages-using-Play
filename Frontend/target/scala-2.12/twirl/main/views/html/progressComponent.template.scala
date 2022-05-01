
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

object progressComponent extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
"""),_display_(/*3.2*/bootLayout("")/*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""
    """),format.raw/*4.5*/("""<body>
        <main>
            <div id="welcome" class="carousel slide" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#welcome" data-slide-to="0" class="active"></li>
                    <li data-target="#welcome" data-slide-to="1"></li>
                    <li data-target="#welcome" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner">
                    <div class="carousel-item active welcome-image1">
                        <div class="container">
                            <div class="carousel-caption">
                                <h1>Welcome to the topics page!</h1>
                                <p><a class="btn btn-lg btn-primary" href=""""),_display_(/*17.77*/routes/*17.83*/.PapersController.searchTopic()),format.raw/*17.114*/("""" role="button">Chemistry</a></p>
                            </div>
                        </div>
                    </div>
                    <div class="carousel-item welcome-image2">
                        <div class="container">
                            <div class="carousel-caption text-left">
                                <h1>More about...</h1>
                                <p><a class="btn btn-lg btn-primary" href=""""),_display_(/*25.77*/routes/*25.83*/.PapersController.searchTopic()),format.raw/*25.114*/("""" role="button">Biology</a></p>
                            </div>
                        </div>
                    </div>
                    <div class="carousel-item welcome-image3">
                        <div class="container">
                            <div class="carousel-caption text-left">
                                <h1>Discover...</h1>
                                <p><a class="btn btn-lg btn-primary" href=""""),_display_(/*33.77*/routes/*33.83*/.PapersController.searchTopic()),format.raw/*33.114*/("""" role="button">Physics</a></p>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- done carousel inner -->
                <a class="carousel-control-prev" href="#welcome" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#welcome" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
        </main>
        <script src="https://code.jquery.com/jquery-3.6.0.slim.min.js"></script>
        <script src=""""),_display_(/*50.23*/routes/*50.29*/.Assets.at("javascripts/bootstrap.js")),format.raw/*50.67*/(""""></script>
    </body>
""")))}),format.raw/*52.2*/("""
"""),format.raw/*53.1*/("""</html>
    <!--<div class="jumbotron jumbotron-donuts">
            <div class="progress">
                <div class="progress-bar bg-info progress-bar-striped progress-bar-animated" style="width: 60%" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100">
                    Until Summer Break </div>
            </div>
            <div class="progress mt-4">
                <div class="progress-bar bg-danger progress-bar-striped progress-bar-animated" style="width: 90%" role="progressbar" aria-valuenow="90" aria-valuemin="0" aria-valuemax="100">
                    Current Sleepiness </div>
            </div>
            <div class="progress mt-4">
                <div class="progress-bar bg-success progress-bar-striped progress-bar-animated" style="width: 75%" role="progressbar" aria-valuenow="90" aria-valuemin="0" aria-valuemax="100">
                    Project Progress </div>
            </div>
        </div> -->"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-04-30T23:21:26.364
                  SOURCE: C:/Users/kiots/Documents/software/a-web-application/Frontend/app/views/progressComponent.scala.html
                  HASH: 55b01d049b97f975d1b68866abf10fbdd66742ec
                  MATRIX: 1042->0|1093->26|1115->40|1154->42|1186->48|1989->824|2004->830|2057->861|2530->1307|2545->1313|2598->1344|3067->1786|3082->1792|3135->1823|4036->2697|4051->2703|4110->2741|4167->2768|4196->2770
                  LINES: 33->1|35->3|35->3|35->3|36->4|49->17|49->17|49->17|57->25|57->25|57->25|65->33|65->33|65->33|82->50|82->50|82->50|84->52|85->53
                  -- GENERATED --
              */
          