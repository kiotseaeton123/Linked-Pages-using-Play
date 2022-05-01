
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

object forFun extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE>
    <html>
        <head>
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
            <link rel="stylesheet" href=""""),_display_(/*6.43*/routes/*6.49*/.Assets.at("stylesheets/boot4.6.css")),format.raw/*6.86*/("""">
            <link rel="stylesheet" href=""""),_display_(/*7.43*/routes/*7.49*/.Assets.at("stylesheets/background.css")),format.raw/*7.89*/("""">
        </head>
        <style>
            .row>[class^=col]"""),format.raw/*10.30*/("""{"""),format.raw/*10.31*/("""
                """),format.raw/*11.17*/("""padding-top: 1em;
                padding-bottom: 1em;
                background-color: rgba(200, 89, 27, 0.25);
                border: 1px solid rgba(250, 75, 15, 0.4);
            """),format.raw/*15.13*/("""}"""),format.raw/*15.14*/("""
            """),format.raw/*16.13*/(""".row"""),format.raw/*16.17*/("""{"""),format.raw/*16.18*/("""
                """),format.raw/*17.17*/("""margin-top: 0.25em;
            """),format.raw/*18.13*/("""}"""),format.raw/*18.14*/("""
        """),format.raw/*19.9*/("""</style>
        <body>
            <div class="container">
                <div class="row">
                    <div class="col">element 1 </div>
                    <div class="col">element 2 </div>
                    <div class="col">element 3 </div>
                </div>
                <div class="row">
                    <div class="col-md-2">element 1 </div>
                    <div class="col-md-7">element 2 </div>
                    <div class="col-md-3">element 3 </div>
                </div>
                <div class="row">
                    <div class="col-sm-4 col-md-8">
                        I want 8 columns!
                    </div>
                    <div class="col-sm-8 col-md-4">
                        I'll go with 4 columns...
                    </div>
                </div>
                <div class="row">
                    <img src=""""),_display_(/*41.32*/routes/*41.38*/.Assets.at("images/favicon.png")),format.raw/*41.70*/("""" alt="Logo" class="col-sm-8 col-md-4"/>
                    <div class="col-sm-4 col-md-8">
                        <h1>Linked Pages</h1>
                        <h2>Welcome to our site</h2>
                        <p>
                            Topics on Chemistry, Biology, Physics, Computer Science, Software Development, Machine Learning and more...
                        </p>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-4 offset-md-4">
                        Gimme space...
                    </div>
                    <div class="col-md-4">
                        I'll just go with 4 spaces...
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-4">1/3</div>
                    <div class="col-md-4 order-8">2/3</div>
                    <div class="col-md-4 order-1">3/3</div>
                </div>
            </div>
        </body>
    </html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-04-30T22:24:08.960
                  SOURCE: C:/Users/kiots/Documents/software/a-web-application/Frontend/app/views/forFun.scala.html
                  HASH: 521bace2a56a084b2bc3fb259016af9d1ed37090
                  MATRIX: 1031->0|1275->218|1289->224|1346->261|1418->307|1432->313|1492->353|1587->420|1616->421|1662->439|1878->627|1907->628|1949->642|1981->646|2010->647|2056->665|2117->698|2146->699|2183->709|3117->1616|3132->1622|3185->1654
                  LINES: 33->1|38->6|38->6|38->6|39->7|39->7|39->7|42->10|42->10|43->11|47->15|47->15|48->16|48->16|48->16|49->17|50->18|50->18|51->19|73->41|73->41|73->41
                  -- GENERATED --
              */
          