// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Workspace/Softwarearchitektur/newwworkspace/chess-htwg-web/conf/routes
// @DATE:Tue Oct 29 13:10:14 CET 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
