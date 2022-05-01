
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/kiots/Documents/software/team1-search-engine/ebean-backend/conf/routes
// @DATE:Sat Apr 30 21:24:54 CDT 2022

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserController UserController = new controllers.ReverseUserController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReversePapersController PapersController = new controllers.ReversePapersController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserController UserController = new controllers.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReversePapersController PapersController = new controllers.javascript.ReversePapersController(RoutesPrefix.byNamePrefix());
  }

}
