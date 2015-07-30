package controllers

import play.api._
import play.api.mvc._
import play.twirl.api.Html;

class Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  /*
  //def main = Action {
//      Ok(views.html.main("Your new application is ready.",Html.apply("<h1>Hello Play Scala</h1>")))
  //}
  */
  def echo(arg: String) = Action {
      Ok(arg);
  }

}
