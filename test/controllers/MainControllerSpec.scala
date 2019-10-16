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

    "render the chess page and move a piece from a new instance of controller" in {
      val controller = new MainController(stubControllerComponents())
      val home = controller.chess().apply(FakeRequest(GET, "/chess/move?fromRow=1&fromCol=1&toRow=2&toCol=1"))

      status(home) mustBe OK
      contentType(home) mustBe Some("text/html")
      contentAsString(home) must include ("----------------")
    }

//    "render the index page from the application" in {
//      val controller = inject[MainController]
//      val home = controller.index().apply(FakeRequest(GET, "/"))
//
//      status(home) mustBe OK
//      contentType(home) mustBe Some("text/html")
//      contentAsString(home) must include ("Welcome to Play")
//    }
//
//    "render the index page from the router" in {
//      val request = FakeRequest(GET, "/")
//      val home = route(app, request).get
//
//      status(home) mustBe OK
//      contentType(home) mustBe Some("text/html")
//      contentAsString(home) must include ("Welcome to Play")
//    }
  }
}
