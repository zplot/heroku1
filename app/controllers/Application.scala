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

  def prueba6 = Action {
    val title = "Esto es el título"
    val tree1 = Tree(List(Tree(List()), Tree(List()), Tree(List())))



    val node1 = Node(40, 50, 5, "red")
    val node2 = Node(60, 50, 5, "red")
    val node3 = Node(80, 50, 5, "red")
    val nodeList = List[Node](node1, node2, node3)

    val parameters = (title, nodeList)
    Ok(views.html.prueba6(parameters))
  }


}

