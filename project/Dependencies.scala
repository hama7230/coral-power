import sbt._

object Version {
  val scala          = "2.10.5"
  val spark          = "1.4.1"
  val scalaTest      = "2.2.4"
  val slf4japi       = "1.7.12"
  val slf4jsimple    = "1.7.12"
  val config         = "1.3.0"
}

object Library {

  val sparkCore      = "org.apache.spark"  %% "spark-core"       % Version.spark % "provided"
  val scalaTest      = "org.scalatest"     %% "scalatest"        % Version.scalaTest   % "test"
  val slf4japi       = "org.slf4j"         % "slf4j-api"         % Version.slf4japi % "provided"
  val slf4jnop    = "org.slf4j"         % "slf4j-nop"      % Version.slf4jsimple % "test"
  val config         = "com.typesafe"      % "config"            % Version.config

}

object Dependencies {

  import Library._

  val coral = List (
    sparkCore,
    scalaTest,
    slf4japi,
    slf4jnop,
    config
  )
}
