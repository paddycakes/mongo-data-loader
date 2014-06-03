import sbt._

object Version {
  val scala        = "2.11.0"
  val scalaParsers = "1.0.1"
  val scalaTest    = "2.1.4"
  val mongoCasbah = "2.7.2"
  // val slf4j = "1.6.4"
}

object Library {
  val scalaParsers = "org.scala-lang.modules" %% "scala-parser-combinators" % Version.scalaParsers
  val scalaTest    = "org.scalatest"          %% "scalatest"                % Version.scalaTest
  val mongoCasbah    = "org.mongodb"          %% "casbah"                % Version.mongoCasbah
  // val slf4j    = "org.slf4j"          %% "slf4j-simple"                % Version.slf4j
}

object Dependencies {

  import Library._

  val mongoDataLoader = List(
    scalaParsers,
    scalaTest % "test",
    mongoCasbah //,
    // slf4j
  )
}
