name := """scalaz_examples"""

version := "1.0"

scalaVersion := "2.12.4"

scalacOptions += "-Ypartial-unification"

EclipseKeys.withSource := true
EclipseKeys.withJavadoc := false

val scalazVersion = "7.2.18"

libraryDependencies += "org.scalaz" %% "scalaz-core" % scalazVersion withSources() withJavadoc()
libraryDependencies += "org.scalaz" %% "scalaz-effect" % scalazVersion withSources() withJavadoc()
libraryDependencies += "org.scalaz" %% "scalaz-iteratee" % scalazVersion withSources() withJavadoc()
libraryDependencies += "org.scalaz" %% "scalaz-concurrent" % scalazVersion withSources() withJavadoc()
libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.13.5" withSources() withJavadoc()

libraryDependencies += "org.typelevel" %% "cats-core" % "1.0.0"
libraryDependencies += "org.typelevel" %% "cats-free" % "1.0.0"
libraryDependencies += "org.typelevel" %% "cats-macros" % "1.0.0"

libraryDependencies += "org.typelevel" %% "cats-effect" % "0.6"
libraryDependencies += "org.typelevel" %% "cats-kernel" % "1.0.0"
libraryDependencies += "org.typelevel" %% "cats-jvm" % "1.0.0"
libraryDependencies += "org.typelevel" %% "cats-mtl-core" % "0.2.0"
libraryDependencies += "org.typelevel" %% "alleycats-core" % "1.0.0"
libraryDependencies += "org.typelevel" %% "catalysts-lawkit" % "0.0.5"

libraryDependencies += "org.typelevel" %% "cats-effect-laws" % "0.6" % Test
libraryDependencies += "org.typelevel" %% "cats-laws" % "1.0.0" % "test"
libraryDependencies += "org.typelevel" %% "discipline" % "0.8" % "test"
libraryDependencies += "org.typelevel" %% "cats-kernel-laws" % "1.0.0" % Test
libraryDependencies += "org.typelevel" %% "cats-testkit" % "1.0.0" % Test


libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.4"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % "test"

  
resolvers += Resolver.sonatypeRepo("releases")

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.5")
addCompilerPlugin("org.spire-math" % "kind-projector" % "0.9.5" cross CrossVersion.binary)