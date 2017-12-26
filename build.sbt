name := """scalaz_examples"""

version := "1.0"

scalaVersion := "2.12.4"

scalacOptions += "-Ypartial-unification"

EclipseKeys.withSource := true
EclipseKeys.withJavadoc := false

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.3" % "test"
libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.2.18" withSources() withJavadoc()
libraryDependencies += "org.scalaz" %% "scalaz-effect" % "7.2.18" withSources() withJavadoc()
libraryDependencies += "org.scalaz" %% "scalaz-iteratee" % "7.2.18" withSources() withJavadoc()
libraryDependencies += "org.scalaz" %% "scalaz-concurrent" % "7.2.18" withSources() withJavadoc()
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


  
resolvers += Resolver.sonatypeRepo("releases")

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.5")
addCompilerPlugin("org.spire-math" % "kind-projector" % "0.9.5" cross CrossVersion.binary)