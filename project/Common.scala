import com.typesafe.sbt.SbtScalariform._
import sbt._
import sbt.Keys._

import scalariform.formatter.preferences.{PreserveDanglingCloseParenthesis, DoubleIndentClassDeclaration, AlignSingleLineCaseStatements}

object Common {
  val settings =
    scalariformSettings ++
      List(
        // Core Settings
        organization := "com.example.scala",
        version := "0.0.1",
        scalaVersion := Version.scala,
        crossScalaVersions := List(scalaVersion.value),
        scalacOptions ++= List(
          "-unchecked",
          "-deprecation",
          "-language:_",
          "-target:jvm-1.7",
          "-encoding", "UTF-8"
        ),
        unmanagedSourceDirectories in Compile := List((scalaSource in Compile).value),
        unmanagedSourceDirectories in Test := List((scalaSource in Test).value),
        // Scalariform settings
        ScalariformKeys.preferences := ScalariformKeys.preferences.value
          .setPreference(AlignSingleLineCaseStatements, true)
          .setPreference(AlignSingleLineCaseStatements.MaxArrowIndent, 100)
          .setPreference(DoubleIndentClassDeclaration, true)
          .setPreference(PreserveDanglingCloseParenthesis, true)
      )
}