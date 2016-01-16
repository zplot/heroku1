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

  def hopf1 = Action {
    val t5 = Tree(List())

    val t6 = Tree(List(t5, t5, t5))

    val t7 = Tree(List(t5, t6, t5))

    val t8 = Tree.string2Tree(t7.toString)

    Ok(views.html.hopf1(t8.toString))
  }

  def prueba5 = Action {
    val titulo = "Hola a ver ahora"
    Ok(views.html.prueba5(titulo))
  }


}

