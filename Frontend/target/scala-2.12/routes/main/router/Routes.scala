// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/kiots/Documents/software/a-web-application/Frontend/conf/routes
// @DATE:Sat Apr 30 23:21:26 CDT 2022

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  PapersController_0: controllers.PapersController,
  // @LINE:16
  HomeController_2: controllers.HomeController,
  // @LINE:23
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    PapersController_0: controllers.PapersController,
    // @LINE:16
    HomeController_2: controllers.HomeController,
    // @LINE:23
    Assets_1: controllers.Assets
  ) = this(errorHandler, PapersController_0, HomeController_2, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, PapersController_0, HomeController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.PapersController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.PapersController.searchPage()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """surprise""", """controllers.PapersController.renderSurprise()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search-handler""", """controllers.PapersController.searchHandler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """topic""", """controllers.PapersController.searchTopic()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """test-handler""", """controllers.PapersController.testHandler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """index""", """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.loginHandler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.HomeController.signup()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.HomeController.signupHandler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """test""", """controllers.HomeController.testHandler()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_PapersController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_PapersController_index0_invoker = createInvoker(
    PapersController_0.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PapersController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Routes
 This file defines all application routes (Higher priority routes first)
 ~~~~
below are http patterns available on web application""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_PapersController_searchPage1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_PapersController_searchPage1_invoker = createInvoker(
    PapersController_0.searchPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PapersController",
      "searchPage",
      Nil,
      "GET",
      this.prefix + """search""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_PapersController_renderSurprise2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("surprise")))
  )
  private[this] lazy val controllers_PapersController_renderSurprise2_invoker = createInvoker(
    PapersController_0.renderSurprise(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PapersController",
      "renderSurprise",
      Nil,
      "GET",
      this.prefix + """surprise""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_PapersController_searchHandler3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search-handler")))
  )
  private[this] lazy val controllers_PapersController_searchHandler3_invoker = createInvoker(
    PapersController_0.searchHandler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PapersController",
      "searchHandler",
      Nil,
      "GET",
      this.prefix + """search-handler""",
      """routes for coordination between http endpoint and logic""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_PapersController_searchTopic4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("topic")))
  )
  private[this] lazy val controllers_PapersController_searchTopic4_invoker = createInvoker(
    PapersController_0.searchTopic(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PapersController",
      "searchTopic",
      Nil,
      "GET",
      this.prefix + """topic""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_PapersController_testHandler5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("test-handler")))
  )
  private[this] lazy val controllers_PapersController_testHandler5_invoker = createInvoker(
    PapersController_0.testHandler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PapersController",
      "testHandler",
      Nil,
      "GET",
      this.prefix + """test-handler""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_index6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("index")))
  )
  private[this] lazy val controllers_HomeController_index6_invoker = createInvoker(
    HomeController_2.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """index""",
      """below are example routes, not used for this project""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_loginHandler7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_loginHandler7_invoker = createInvoker(
    HomeController_2.loginHandler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "loginHandler",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_signup8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_HomeController_signup8_invoker = createInvoker(
    HomeController_2.signup(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signup",
      Nil,
      "GET",
      this.prefix + """signup""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_signupHandler9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_HomeController_signupHandler9_invoker = createInvoker(
    HomeController_2.signupHandler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "signupHandler",
      Nil,
      "GET",
      this.prefix + """register""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_testHandler10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("test")))
  )
  private[this] lazy val controllers_HomeController_testHandler10_invoker = createInvoker(
    HomeController_2.testHandler(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "testHandler",
      Nil,
      "GET",
      this.prefix + """test""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Assets_at11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at11_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_PapersController_index0_route(params@_) =>
      call { 
        controllers_PapersController_index0_invoker.call(PapersController_0.index())
      }
  
    // @LINE:7
    case controllers_PapersController_searchPage1_route(params@_) =>
      call { 
        controllers_PapersController_searchPage1_invoker.call(PapersController_0.searchPage())
      }
  
    // @LINE:8
    case controllers_PapersController_renderSurprise2_route(params@_) =>
      call { 
        controllers_PapersController_renderSurprise2_invoker.call(PapersController_0.renderSurprise())
      }
  
    // @LINE:11
    case controllers_PapersController_searchHandler3_route(params@_) =>
      call { 
        controllers_PapersController_searchHandler3_invoker.call(PapersController_0.searchHandler())
      }
  
    // @LINE:12
    case controllers_PapersController_searchTopic4_route(params@_) =>
      call { 
        controllers_PapersController_searchTopic4_invoker.call(PapersController_0.searchTopic())
      }
  
    // @LINE:13
    case controllers_PapersController_testHandler5_route(params@_) =>
      call { 
        controllers_PapersController_testHandler5_invoker.call(PapersController_0.testHandler())
      }
  
    // @LINE:16
    case controllers_HomeController_index6_route(params@_) =>
      call { 
        controllers_HomeController_index6_invoker.call(HomeController_2.index())
      }
  
    // @LINE:17
    case controllers_HomeController_loginHandler7_route(params@_) =>
      call { 
        controllers_HomeController_loginHandler7_invoker.call(HomeController_2.loginHandler())
      }
  
    // @LINE:18
    case controllers_HomeController_signup8_route(params@_) =>
      call { 
        controllers_HomeController_signup8_invoker.call(HomeController_2.signup())
      }
  
    // @LINE:19
    case controllers_HomeController_signupHandler9_route(params@_) =>
      call { 
        controllers_HomeController_signupHandler9_invoker.call(HomeController_2.signupHandler())
      }
  
    // @LINE:20
    case controllers_HomeController_testHandler10_route(params@_) =>
      call { 
        controllers_HomeController_testHandler10_invoker.call(HomeController_2.testHandler())
      }
  
    // @LINE:23
    case controllers_Assets_at11_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at11_invoker.call(Assets_1.at(path, file))
      }
  }
}
