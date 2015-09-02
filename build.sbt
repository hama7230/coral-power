
lazy val ibm1 = project in file(".")

name := "Coral Power"

version := "0.0.1"

scalaVersion := Version.scala

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"

resolvers += "Spark Packages Repo" at "http://dl.bintray.com/spark-packages/maven"

libraryDependencies ++= Dependencies.coral

libraryDependencies ~= { _.map(_.exclude("org.slf4j", "slf4j-log4j12")) }

assemblyJarName in assembly := "coral.jar"


