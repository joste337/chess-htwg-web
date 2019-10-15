package controllers

import com.google.inject.Guice
import de.htwg.se.SE_Chess_HTWG.ChessModule
import de.htwg.se.SE_Chess_HTWG.aView.gui.SwingGui
import de.htwg.se.SE_Chess_HTWG.aView.tui.Tui
import de.htwg.se.SE_Chess_HTWG.controller.{ControllerImpl, ControllerInterface}
import javax.inject._
import play.api.mvc._

@Singleton
class MainController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  val injector = Guice.createInjector(new ChessModule)
  val controller = injector.getInstance(classOf[ControllerInterface])
  val tui = new Tui(controller)
  val gui = new SwingGui(controller)

  controller.createNewGrid

  def chess() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index(grid = controller.gridString))
  }

  def newGrid() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index(grid = controller.createNewGrid.toString))
  }

  def move(fromRow: Int, fromCol: Int, toRow: Int, toCol: Int) = Action { implicit request: Request[AnyContent] =>
    controller.selectSquare(fromRow, fromCol)
    controller.selectSquare(toRow, toCol)
    Ok(views.html.index(grid = controller.gridString))
  }

  def save() = Action { implicit request: Request[AnyContent] =>
    controller.save()
    Ok(views.html.index(grid = controller.gridString))
  }

  def load() = Action { implicit request: Request[AnyContent] =>
    controller.load()
    Ok(views.html.index(grid = controller.gridString))
  }
}
