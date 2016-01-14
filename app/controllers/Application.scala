package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Hola, soy Luis Fontes"))
  }

  def prueba1 = Action {
    Ok(views.html.prueba1("Hola mundo"))
  }

  def prueba2 = Action {
    Ok(views.html.prueba2("Hola Luis"))
  }

  def prueba3 = Action {
    Ok(views.html.prueba3("Hola Luis"))
  }

  def prueba4 = Action {
    Ok(views.html.prueba4())
  }


}

