
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

object bootLayout extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href=""""),_display_(/*7.39*/routes/*7.45*/.Assets.at("stylesheets/bootstrap.css")),format.raw/*7.84*/("""">
        <link rel="stylesheet" href=""""),_display_(/*8.39*/routes/*8.45*/.Assets.at("stylesheets/background.css")),format.raw/*8.85*/("""">
    </head>
    <body>
        <header>
            <!--navbar collapses when below the sm breakpoint-->
            <nav class="navbar navbar-expand-sm navbar-light fixed-top bg-primary py-1">
                <a class="navbar-brand ml-4" href=""""),_display_(/*14.53*/routes/*14.59*/.PapersController.index()),format.raw/*14.84*/("""">
                    Linked Papers
                </a>
                <div class="collapse navbar-collapse" id="navbarCollapse">
                    <ul class="nav navbar-nav mr-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href=""""),_display_(/*20.56*/routes/*20.62*/.PapersController.index()),format.raw/*20.87*/("""">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href=""""),_display_(/*23.56*/routes/*23.62*/.PapersController.searchPage()),format.raw/*23.92*/("""">Search</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href=""""),_display_(/*26.56*/routes/*26.62*/.PapersController.renderSurprise()),format.raw/*26.96*/("""">Surprise</a>
                        </li>
                    </ul>
                </div>
            </nav>
        </header>
        """),_display_(/*32.10*/content),format.raw/*32.17*/("""
    """),format.raw/*33.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-04-30T22:24:08.865
                  SOURCE: C:/Users/kiots/Documents/software/a-web-application/Frontend/app/views/bootLayout.scala.html
                  HASH: c71a975c4d91d9ca42296409768fcfa2ce8a2931
                  MATRIX: 958->1|1083->31|1111->33|1340->236|1354->242|1413->281|1481->323|1495->329|1555->369|1837->624|1852->630|1898->655|2228->958|2243->964|2289->989|2461->1134|2476->1140|2527->1170|2701->1317|2716->1323|2771->1357|2944->1503|2972->1510|3005->1516
                  LINES: 28->1|33->1|34->2|39->7|39->7|39->7|40->8|40->8|40->8|46->14|46->14|46->14|52->20|52->20|52->20|55->23|55->23|55->23|58->26|58->26|58->26|64->32|64->32|65->33
                  -- GENERATED --
              */
          