// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Workspace/Softwarearchitektur/newwworkspace/chess-htwg-web/conf/routes
// @DATE:Tue Oct 29 13:10:14 CET 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseMainController MainController = new controllers.ReverseMainController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseMainController MainController = new controllers.javascript.ReverseMainController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
