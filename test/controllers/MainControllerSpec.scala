package controllers

import org.scalatestplus.play._
import org.scalatestplus.play.guice._
import play.api.test._
import play.api.test.Helpers._

class MainControllerSpec extends PlaySpec with GuiceOneAppPerTest with Injecting {

  "HomeController GET" should {

    "render the index page from a new instance of controller" in {
      val controller = new MainController(stubControllerComponents())
      val home = controller.chess().apply(FakeRequest(GET, "/"))

      status(home) mustBe OK
      contentType(home) mustBe Some("text/html")
      contentAsString(home) must include ("----------------")
    }

    "render the chess page from a new instance of controller" in {
      val controller = new MainController(stubControllerComponents())
      val home = controller.chess().apply(FakeRequest(GET, "/chess"))

      status(home) mustBe OK
      contentType(home) mustBe Some("text/html")
      contentAsString(home) must include ("----------------")
    }

    "render the chess page and create a new board from a new instance of controller" in {
      val controller = new MainController(stubControllerComponents())
      val home = controller.chess().apply(FakeRequest(GET, "/chess/new"))

      status(home) mustBe OK
      contentType(home) mustBe Some("text/html")
      contentAsString(home) must include ("----------------")
    }

    "render the chess page and move a piece from a new instance of controller" in {
      val controller = new MainController(stubControllerComponents())
      val home = controller.chess().apply(FakeRequest(GET, "/chess/move?fromRow=1&fromCol=1&toRow=2&toCol=1"))

      status(home) mustBe OK
      contentType(home) mustBe Some("text/html")
      contentAsString(home) must include ("----------------")
    }

    "render the chess page and ssave from a new instance of controller" in {
      val controller = new MainController(stubControllerComponents())
      val home = controller.chess().apply(FakeRequest(GET, "/chess/save"))

      status(home) mustBe OK
      contentType(home) mustBe Some("text/html")
      contentAsString(home) must include ("----------------")
    }

    "render the chess page and load from a new instance of controller" in {
      val controller = new MainController(stubControllerComponents())
      val home = controller.chess().apply(FakeRequest(GET, "/chess/load"))

      status(home) mustBe OK
      contentType(home) mustBe Some("text/html")
      contentAsString(home) must include ("----------------")
    }
  }
}
