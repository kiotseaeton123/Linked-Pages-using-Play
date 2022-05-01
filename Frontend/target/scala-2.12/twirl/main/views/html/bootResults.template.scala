
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

object bootResults extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.Paper,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(paper: models.Paper):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.23*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <body>
        <h1>"""),_display_(/*5.14*/paper/*5.19*/.getTitle),format.raw/*5.28*/("""</h1>
        <h2>"""),_display_(/*6.14*/paper/*6.19*/.getAuthor),format.raw/*6.29*/("""</h2>
        <h2>"""),_display_(/*7.14*/paper/*7.19*/.getDate),format.raw/*7.27*/("""</h2>
        <h3>"""),_display_(/*8.14*/paper/*8.19*/.getTopic),format.raw/*8.28*/("""</h3>
    </body>
</html>"""))
      }
    }
  }

  def render(paper:models.Paper): play.twirl.api.HtmlFormat.Appendable = apply(paper)

  def f:((models.Paper) => play.twirl.api.HtmlFormat.Appendable) = (paper) => apply(paper)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2022-04-30T22:24:08.912
                  SOURCE: C:/Users/kiots/Documents/software/a-web-application/Frontend/app/views/bootResults.scala.html
                  HASH: a22f18b1add82941b60f912bee8fbb74a9370a33
                  MATRIX: 960->1|1076->22|1104->24|1180->74|1193->79|1222->88|1268->108|1281->113|1311->123|1357->143|1370->148|1398->156|1444->176|1457->181|1486->190
                  LINES: 28->1|33->1|34->2|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8
                  -- GENERATED --
              */
          