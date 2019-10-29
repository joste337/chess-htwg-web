// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Workspace/Softwarearchitektur/newwworkspace/chess-htwg-web/conf/routes
// @DATE:Tue Oct 29 13:10:14 CET 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers.javascript {

  // @LINE:1
  class ReverseMainController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:4
    def move: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.move",
      """
        function(fromRow0,fromCol1,toRow2,toCol3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "chess/move" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("fromRow", fromRow0), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("fromCol", fromCol1), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("toRow", toRow2), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("toCol", toCol3)])})
        }
      """
    )
  
    // @LINE:3
    def newGrid: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.newGrid",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "chess/new"})
        }
      """
    )
  
    // @LINE:7
    def select: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.select",
      """
        function(row0,col1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "chess/select" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("row", row0), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("col", col1)])})
        }
      """
    )
  
    // @LINE:2
    def chess: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.chess",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "chess"})
        }
      """
    )
  
    // @LINE:5
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "chess/save"})
        }
      """
    )
  
    // @LINE:1
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:6
    def load: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MainController.load",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "chess/load"})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
