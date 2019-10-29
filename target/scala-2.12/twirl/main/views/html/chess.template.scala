
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

object chess extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[de.htwg.se.SE_Chess_HTWG.controller.ControllerInterface,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(controller:de.htwg.se.SE_Chess_HTWG.controller.ControllerInterface):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*4.2*/pieceImage/*4.12*/(row:Int, col:Int) = {{"images/pieces/" + controller.getSquare(row, col).value.get.getImageName + ".png"}};def /*5.2*/squareColor/*5.13*/(row:Int, col:Int) = {{
    if(controller.getSquare(row,col).highlighhted) { "highlighted" }
    else if(controller.getSquare(row,col).isWhite) { "white" } else { "black" }}};def /*8.2*/hasPiece/*8.10*/(row:Int, col:Int) = {{controller.getSquare(row, col).isSet}};
Seq[Any](format.raw/*1.70*/("""


"""),format.raw/*4.115*/("""
"""),format.raw/*7.81*/("""
"""),format.raw/*8.68*/("""

"""),_display_(/*10.2*/main("HTWG Chess")/*10.20*/ {_display_(Seq[Any](format.raw/*10.22*/("""
    """),format.raw/*11.5*/("""<div class="gamecontainer">
        <div class="game">
            """),_display_(/*13.14*/for(row <- (0 until 8).reverse) yield /*13.45*/ {_display_(Seq[Any](format.raw/*13.47*/("""
                """),format.raw/*14.17*/("""<div class="row">
                    """),_display_(/*15.22*/for(col <- 0 until 8) yield /*15.43*/ {_display_(Seq[Any](format.raw/*15.45*/("""
                        """),format.raw/*16.25*/("""<a href="/chess/select?row="""),_display_(/*16.53*/row),format.raw/*16.56*/("""&col="""),_display_(/*16.62*/col),format.raw/*16.65*/("""">
                            <div class="square """),_display_(/*17.49*/squareColor(row,col)),format.raw/*17.69*/("""">
                                """),_display_(/*18.34*/if(hasPiece(row, col))/*18.56*/ {_display_(Seq[Any](format.raw/*18.58*/("""
                                    """),format.raw/*19.37*/("""<img src=""""),_display_(/*19.48*/routes/*19.54*/.Assets.versioned({pieceImage(row, col)})),format.raw/*19.95*/("""">
                                """)))}),format.raw/*20.34*/("""
                            """),format.raw/*21.29*/("""</div>
                        </a>
                    """)))}),format.raw/*23.22*/("""
                """),format.raw/*24.17*/("""</div>
            """)))}),format.raw/*25.14*/("""
        """),format.raw/*26.9*/("""</div>
    </div>
""")))}))
      }
    }
  }

  def render(controller:de.htwg.se.SE_Chess_HTWG.controller.ControllerInterface): play.twirl.api.HtmlFormat.Appendable = apply(controller)

  def f:((de.htwg.se.SE_Chess_HTWG.controller.ControllerInterface) => play.twirl.api.HtmlFormat.Appendable) = (controller) => apply(controller)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-10-29T16:12:00.585
                  SOURCE: C:/Workspace/Softwarearchitektur/newwworkspace/chess-htwg-web/app/views/chess.scala.html
                  HASH: ffa33a1838081703178a1690169e29a9324ae867
                  MATRIX: 778->1|924->76|942->86|1060->192|1079->203|1267->379|1283->387|1373->69|1407->189|1436->376|1465->445|1496->450|1523->468|1563->470|1596->476|1693->546|1740->577|1780->579|1826->597|1893->637|1930->658|1970->660|2024->686|2079->714|2103->717|2136->723|2160->726|2239->778|2280->798|2344->835|2375->857|2415->859|2481->897|2519->908|2534->914|2596->955|2664->992|2722->1022|2812->1081|2858->1099|2910->1120|2947->1130
                  LINES: 21->1|25->4|25->4|25->5|25->5|27->8|27->8|28->1|31->4|32->7|33->8|35->10|35->10|35->10|36->11|38->13|38->13|38->13|39->14|40->15|40->15|40->15|41->16|41->16|41->16|41->16|41->16|42->17|42->17|43->18|43->18|43->18|44->19|44->19|44->19|44->19|45->20|46->21|48->23|49->24|50->25|51->26
                  -- GENERATED --
              */
          