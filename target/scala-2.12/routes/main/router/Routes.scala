// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Workspace/Softwarearchitektur/newwworkspace/chess-htwg-web/conf/routes
// @DATE:Tue Oct 29 13:10:14 CET 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  MainController_1: controllers.MainController,
  // @LINE:9
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    MainController_1: controllers.MainController,
    // @LINE:9
    Assets_0: controllers.Assets
  ) = this(errorHandler, MainController_1, Assets_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, MainController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.MainController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """chess""", """controllers.MainController.chess"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """chess/new""", """controllers.MainController.newGrid"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """chess/move""", """controllers.MainController.move(fromRow:Int, fromCol:Int, toRow:Int, toCol:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """chess/save""", """controllers.MainController.save"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """chess/load""", """controllers.MainController.load"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """chess/select""", """controllers.MainController.select(row:Int, col:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val controllers_MainController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_MainController_index0_invoker = createInvoker(
    MainController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MainController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:2
  private[this] lazy val controllers_MainController_chess1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("chess")))
  )
  private[this] lazy val controllers_MainController_chess1_invoker = createInvoker(
    MainController_1.chess,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MainController",
      "chess",
      Nil,
      "GET",
      this.prefix + """chess""",
      """""",
      Seq()
    )
  )

  // @LINE:3
  private[this] lazy val controllers_MainController_newGrid2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("chess/new")))
  )
  private[this] lazy val controllers_MainController_newGrid2_invoker = createInvoker(
    MainController_1.newGrid,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MainController",
      "newGrid",
      Nil,
      "POST",
      this.prefix + """chess/new""",
      """""",
      Seq()
    )
  )

  // @LINE:4
  private[this] lazy val controllers_MainController_move3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("chess/move")))
  )
  private[this] lazy val controllers_MainController_move3_invoker = createInvoker(
    MainController_1.move(fakeValue[Int], fakeValue[Int], fakeValue[Int], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MainController",
      "move",
      Seq(classOf[Int], classOf[Int], classOf[Int], classOf[Int]),
      "GET",
      this.prefix + """chess/move""",
      """""",
      Seq()
    )
  )

  // @LINE:5
  private[this] lazy val controllers_MainController_save4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("chess/save")))
  )
  private[this] lazy val controllers_MainController_save4_invoker = createInvoker(
    MainController_1.save,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MainController",
      "save",
      Nil,
      "POST",
      this.prefix + """chess/save""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_MainController_load5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("chess/load")))
  )
  private[this] lazy val controllers_MainController_load5_invoker = createInvoker(
    MainController_1.load,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MainController",
      "load",
      Nil,
      "GET",
      this.prefix + """chess/load""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_MainController_select6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("chess/select")))
  )
  private[this] lazy val controllers_MainController_select6_invoker = createInvoker(
    MainController_1.select(fakeValue[Int], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MainController",
      "select",
      Seq(classOf[Int], classOf[Int]),
      "GET",
      this.prefix + """chess/select""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_versioned7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned7_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case controllers_MainController_index0_route(params@_) =>
      call { 
        controllers_MainController_index0_invoker.call(MainController_1.index)
      }
  
    // @LINE:2
    case controllers_MainController_chess1_route(params@_) =>
      call { 
        controllers_MainController_chess1_invoker.call(MainController_1.chess)
      }
  
    // @LINE:3
    case controllers_MainController_newGrid2_route(params@_) =>
      call { 
        controllers_MainController_newGrid2_invoker.call(MainController_1.newGrid)
      }
  
    // @LINE:4
    case controllers_MainController_move3_route(params@_) =>
      call(params.fromQuery[Int]("fromRow", None), params.fromQuery[Int]("fromCol", None), params.fromQuery[Int]("toRow", None), params.fromQuery[Int]("toCol", None)) { (fromRow, fromCol, toRow, toCol) =>
        controllers_MainController_move3_invoker.call(MainController_1.move(fromRow, fromCol, toRow, toCol))
      }
  
    // @LINE:5
    case controllers_MainController_save4_route(params@_) =>
      call { 
        controllers_MainController_save4_invoker.call(MainController_1.save)
      }
  
    // @LINE:6
    case controllers_MainController_load5_route(params@_) =>
      call { 
        controllers_MainController_load5_invoker.call(MainController_1.load)
      }
  
    // @LINE:7
    case controllers_MainController_select6_route(params@_) =>
      call(params.fromQuery[Int]("row", None), params.fromQuery[Int]("col", None)) { (row, col) =>
        controllers_MainController_select6_invoker.call(MainController_1.select(row, col))
      }
  
    // @LINE:9
    case controllers_Assets_versioned7_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned7_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
