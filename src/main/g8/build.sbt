val Specs2Version = "$specs2_version$"
val LogbackVersion = "$logback_version$"
lazy val CatsEffectVersion = "$cats_effect_version$"
lazy val CirceVersion      = "$circe_version$"
lazy val ScalaTestVersion  = "$scala_test_version$"
lazy val ScalaCheckVersion = "$scala_check_version$"

lazy val root = (project in file("."))
  .settings(
    organization := "uk.me.tobymiller",
    name := "serverlesscatstest",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := "$scala_version$",
    scalacOptions := Seq(
      "-deprecation",
      "-encoding",
      "UTF-8",
      "-feature",
      "-language:existentials",
      "-language:higherKinds",
      "-Ypartial-unification"
    ),
    libraryDependencies ++= Seq(
      "org.typelevel"   %% "cats-effect"         % CatsEffectVersion,

      "io.circe"        %% "circe-core"          % CirceVersion,
      "io.circe"        %% "circe-generic"       % CirceVersion,
      "io.circe"        %% "circe-parser"       % CirceVersion,

      "org.scalatest"   %% "scalatest"           % ScalaTestVersion  % Test,
      "org.scalacheck"  %% "scalacheck"          % ScalaCheckVersion % Test,
      
      "com.amazonaws" % "aws-lambda-java-events" % "2.2.5",
      "com.amazonaws" % "aws-lambda-java-core" % "1.2.0",

      "uk.me.tobymiller" %% "serverlesscats" % "0.0.1-SNAPSHOT"
    ),
  )

