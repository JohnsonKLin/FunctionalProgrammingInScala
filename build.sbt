name := "FunctionalProgrammingInScala"

version := "1.0"

scalaVersion := "2.11.4"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.8",
  "com.typesafe.akka" %% "akka-testkit" % "2.3.8",
  "org.json4s" %% "json4s-native" % "3.2.10",
  "commons-beanutils" %% "commons-beanutils" % "1.8.2",
  "org.json4s" %% "json4s-native" % "3.2.11",
  "org.specs2" %% "specs2-core" % "2.4.15" % "test"
)