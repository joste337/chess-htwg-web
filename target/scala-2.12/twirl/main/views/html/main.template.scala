
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
import play.api.mvc._
import play.api.data._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>"""),_display_(/*6.17*/title),format.raw/*6.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*7.54*/routes/*7.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*7.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.59*/routes/*8.65*/.Assets.versioned("images/favicon.png")),format.raw/*8.104*/("""">
    </head>
    <body>
        """),_display_(/*11.10*/content),format.raw/*11.17*/("""
        """),format.raw/*12.9*/("""<script src=""""),_display_(/*12.23*/routes/*12.29*/.Assets.versioned("javascripts/main.js")),format.raw/*12.69*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-10-23T07:49:28.411
                  SOURCE: C:/Workspace/Softwarearchitektur/newwworkspace/chess-htwg-web/app/views/main.scala.html
                  HASH: 20ef5eaac8211cf39715a2c9fcca6488cec90add
                  MATRIX: 733->1|858->31|888->35|977->98|1002->103|1091->166|1105->172|1167->213|1255->275|1269->281|1329->320|1394->358|1422->365|1459->375|1500->389|1515->395|1576->435
                  LINES: 21->1|26->1|28->3|31->6|31->6|32->7|32->7|32->7|33->8|33->8|33->8|36->11|36->11|37->12|37->12|37->12|37->12
                  -- GENERATED --
              */
          