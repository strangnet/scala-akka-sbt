lazy val scalaProject = project in file(".")

name := "scala-akka-sbt"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.1"

Common.settings

libraryDependencies ++= Dependencies.scalaProject

//play.Project.playScalaSettings

initialCommands := """|import akka.actor._
                     |import akka.actor.ActorDSL._
                     |import akka.pattern._
                     |import akka.routing._
                     |import akka.util._
                     |import com.typesafe.config._
                     |import scala.concurrent._
                     |import scala.concurrent.duration._""".stripMargin