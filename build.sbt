name := "testScalaSbt"

version := "1.0"

scalaVersion := "2.11.1"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"
libraryDependencies += "junit" % "junit" % "4.11" % "test"
//libraryDependencies += "com.novocode" % "junit-interface" % "0.9" % "test->default",
libraryDependencies += "org.mockito" % "mockito-core" % "1.9.5"
libraryDependencies += "com.typesafe.play" % "play-json_2.11" % "2.5.10"
