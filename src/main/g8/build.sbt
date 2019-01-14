val silhouetteVersion = "5.0.3"
val playMailerVersion = "6.0.1"

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "io.github.todokr",
      scalaVersion := "2.11.12"
    )),
    name := "play-gemba.g8",
    libraryDependencies ++= Seq(
      guice,
      "com.mohiva" %% "play-silhouette" % silhouetteVersion,
      "com.mohiva" %% "play-silhouette-password-bcrypt" % silhouetteVersion,
      "com.mohiva" %% "play-silhouette-persistence" % silhouetteVersion,
      "com.mohiva" %% "play-silhouette-crypto-jca" % silhouetteVersion,
      "com.mohiva" %% "play-silhouette-testkit" % silhouetteVersion,

      "com.typesafe.play" %% "play-mailer" % playMailerVersion,
      "com.typesafe.play" %% "play-mailer-guice" % playMailerVersion,
      "com.enragedginger" %% "akka-quartz-scheduler" % "1.7.1-akka-2.5.x",
      "com.iheart" %% "ficus" % "1.4.3"
    )
  )

enablePlugins(PlayScala)
