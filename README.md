
## Linked-Pages: Web Application using Play Framework
a web application to search and share research papers(in deveolopment)

### Play Workflow Basics
the web application is separated between frontend and backend, and each follows the play application structure: they consist of three key components.

1. the `conf/routes` file: connects http endpoint to business logic(via setting http pattern to a controller action call inside the package `app/controllers`
2. the `app/controllers` folder: controllers are the bridge between routes and the project logic; a controller contains logically grouped actions
3. the `app/models` folder: contains project logic
* `conf/application.conf` contains important application configuration information in key value pairs(ie. provides Connection object needed to integrate database API); `application.conf` is compiled to an Application object for Play to reference
* `build.sbt` describes project to build system(sbt); default settings of this play project is defined by sbt plugin(for PlayJava)

### Frontend
- uses Twitter Bootstrap for application UI
- SearchHandler: currently contains functionality for single input search function
- testHandler: for testing purposes(simply prints form output to a web page(`index.html`), to ensure http forms are passing data back in consistent format
- renderSurprise: just for fun... implementation not done yet


### Backend
- uses JDBC plugin to access MySQL datasource
- Ebean ORM is used to map the `app/modules/Paper` class to database table that contains paper information
