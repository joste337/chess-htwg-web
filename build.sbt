name := """chess-htwg-web"""
organization  := "de.htwg.se"
version := "1.0-SNAPSHOT"
scalaVersion := "2.12.8"

lazy val root = (project in file(".")).enablePlugins(PlayScala)


libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.3" % Test
libraryDependencies += "org.scala-lang.modules" % "scala-swing_2.12" % "2.0.1"
libraryDependencies += "net.codingwell" %% "scala-guice" % "4.2.3"

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "comde.twg.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "comde.twg.binders._"
