
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/kiots/Documents/software/team1-search-engine/ebean-backend/conf/routes
// @DATE:Sat Apr 30 21:24:54 CDT 2022


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
