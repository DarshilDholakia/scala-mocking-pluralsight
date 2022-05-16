name := "Unit Testing in Scala"

version := "0.1"

scalaVersion := "2.13.8"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.13" % "3.2.12" % "test",
  "org.scalamock" %% "scalamock" % "5.2.0" % Test
)
