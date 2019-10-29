
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("About Chess")/*1.21*/ {_display_(Seq[Any](format.raw/*1.23*/("""
  """),format.raw/*2.3*/("""<h1>About Chess</h1>

  <p>
    By convention, chess game pieces are divided into white and black sets.
    Each set consists of 16 pieces: one king, one queen, two rooks, two bishops, two knights, and eight pawns.
    The players of the sets are referred to as White and Black, respectively.
    The pieces are set out as shown in the diagram and photo. <br>
    <img src=""""),_display_(/*9.16*/routes/*9.22*/.Assets.versioned("images/chess.png")),format.raw/*9.59*/("""" height=150 width=150>

  </p>

  <p>
    The game is played on a square board of eight rows (called ranks, denoted 1 to 8 from bottom to top according to White's perspective) and eight columns (called files, denoted a to h from left to right according to White's perspective).
    The 64 squares alternate in color and are referred to as light and dark squares.
    The chessboard is placed with a light square at the right-hand corner nearest to each player.
    Thus, each queen starts on a square of its own color (the white queen on a light square; the black queen on a dark square).
  </p>

  <p>
    <ul type="disk">
      <li>The king moves one square in any direction. The king also has a special move called castling that involves also moving a rook.</li>
      <li>A rook can move any number of squares along a rank or file, but cannot leap over other pieces. Along with the king, a rook is involved during the king's castling move.</li>
      <li>A bishop can move any number of squares diagonally, but cannot leap over other pieces.</li>
      <li>The queen combines the power of a rook and bishop and can move any number of squares along a rank, file, or diagonal, but cannot leap over other pieces.</li>
      <li>A knight moves to any of the closest squares that are not on the same rank, file, or diagonal. (Thus the move forms an "L"-shape: two squares vertically and one square horizontally, or two squares horizontally and one square vertically.) The knight is the only piece that can leap over other pieces.</li>
      <li>A pawn can move forward to the unoccupied square immediately in front of it on the same file, or on its first move it can advance two squares along the same file, provided both squares are unoccupied (black dots in the diagram); or the pawn can capture an opponent's piece on a square diagonally in front of it on an adjacent file, by moving to that square (black "x"s). A pawn has two special moves: the en passant capture and promotion.</li>
    </ul>
  </p>

  <h1>History about chess</h1>

  <p>
    Chess was developed in 6th Century AD in Gupta Empire of India — the game was known as Chaturanga. There is a mention of chess in a text from 500 AD.<br>
    <img src=""""),_display_(/*35.16*/routes/*35.22*/.Assets.versioned("images/histo1.jpeg")),format.raw/*35.61*/("""" height=150 width=150>
    <br>
    In 7th Century AD it was adopted as Satranj in Sassanid Persia. Several variations of chess evolved in Persia.
    In these ancient forms of chess, the Queen would only move 1 step in any direction. The bishop could also move only 1 step diagonally.
    By 11th chess travelled to Europe through the Byzantine transmission.
    The next big change in chess was around 1485, when the game of modern chess became popular and has almost the same rules till date.
    At some point, an unknown inventor in Italy or Spain bestowed the weakest non-pawn pieces on the board — Bishop and Queen — with new powers as in modern chess.
    The game became faster and much more intriguing.
    Though some variants in China and Japan had such pieces centuries earlier.
    It was a sexist society, so the excuse that Queen was now so much powerful than the King was explained with that she used her powers to protect her husband.
    This was also known as the Chess of the Mad Queen.
    Chess spread through Europe within the end of the next century.
  </p>

""")))}),format.raw/*49.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-10-23T07:49:28.364
                  SOURCE: C:/Workspace/Softwarearchitektur/newwworkspace/chess-htwg-web/app/views/index.scala.html
                  HASH: 9c7d56186f3d1cb098f0c7e11c70ae0ae3d70c30
                  MATRIX: 811->1|838->20|877->22|907->26|1315->408|1329->414|1386->451|3657->2695|3672->2701|3732->2740|4862->3840
                  LINES: 26->1|26->1|26->1|27->2|34->9|34->9|34->9|60->35|60->35|60->35|74->49
                  -- GENERATED --
              */
          