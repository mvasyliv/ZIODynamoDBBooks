ThisBuild / scalaVersion     := "2.13.10" // "3.2.1"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.mvasyliv"
ThisBuild / organizationName := "mvasyliv"

val zioVersion = "2.0.5"
val zioDynamoDBVersion = "0.2.0-RC2"

lazy val root = (project in file("."))
  .settings(
    name := "ZIODynamoDBBooks",
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % zioVersion,
      "dev.zio" %% "zio-dynamodb" %  zioDynamoDBVersion,
      "dev.zio" %% "zio-test" % zioVersion % Test
    ),
    testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
  )
