name          := "2048SE"
organization  := "de.htwg.se"
version       := "0.0.1"
scalaVersion := "2.12.7"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"

libraryDependencies += "junit" % "junit" % "4.8" % "test"

libraryDependencies += "org.scala-lang.modules" % "scala-swing_2.12" % "2.0.3"

libraryDependencies += "com.google.inject" % "guice" % "4.1.0"

libraryDependencies += "com.google.code.gson" % "gson" % "2.8.5"

libraryDependencies += "net.codingwell" %% "scala-guice" % "4.1.0"

libraryDependencies += "org.scala-lang.modules" % "scala-xml_2.12" % "1.0.6"

libraryDependencies += "com.typesafe.play" %% "play-json" % "2.6.6"

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.5.22"

libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "2.5.22" % Test

libraryDependencies += "com.typesafe.akka" %% "akka-http" % "10.1.8"

libraryDependencies += "com.typesafe.akka" %% "akka-http-testkit" % "10.1.8" % Test

libraryDependencies += "com.typesafe.akka" %% "akka-stream" % "2.5.22"

libraryDependencies += "com.typesafe.akka" %% "akka-stream-testkit" % "2.5.22" % Test