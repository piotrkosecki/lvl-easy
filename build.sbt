name := "lvl-easy"

version := "0.1"

scalaVersion := "2.12.7"

val akkaV = "2.5.17"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaV,
  "com.typesafe.akka" %% "akka-stream" % akkaV,
)