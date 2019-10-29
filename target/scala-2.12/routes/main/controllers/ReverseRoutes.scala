// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Workspace/Softwarearchitektur/newwworkspace/chess-htwg-web/conf/routes
// @DATE:Tue Oct 29 13:10:14 CET 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers {

  // @LINE:1
  class ReverseMainController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:4
    def move(fromRow:Int, fromCol:Int, toRow:Int, toCol:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "chess/move" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("fromRow", fromRow)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("fromCol", fromCol)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("toRow", toRow)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("toCol", toCol)))))
    }
  
    // @LINE:3
    def newGrid(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "chess/new")
    }
  
    // @LINE:7
    def select(row:Int, col:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "chess/select" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("row", row)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("col", col)))))
    }
  
    // @LINE:2
    def chess(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "chess")
    }
  
    // @LINE:5
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "chess/save")
    }
  
    // @LINE:1
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:6
    def load(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "chess/load")
    }
  
  }

  // @LINE:9
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
