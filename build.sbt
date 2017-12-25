name := """scalaz_examples"""

version := "1.0"

scalaVersion := "2.12.4"

EclipseKeys.withSource := true
EclipseKeys.withJavadoc := false

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.3" % "test"
libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.2.18" withSources() withJavadoc()
libraryDependencies += "org.scalaz" %% "scalaz-effect" % "7.2.18" withSources() withJavadoc()
libraryDependencies += "org.scalaz" %% "scalaz-iteratee" % "7.2.18" withSources() withJavadoc()
libraryDependencies += "org.scalaz" %% "scalaz-concurrent" % "7.2.18" withSources() withJavadoc()
libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.13.5" withSources() withJavadoc()

resolvers += Resolver.sonatypeRepo("releases")

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.5")
addCompilerPlugin("org.spire-math" % "kind-projector" % "0.9.5" cross CrossVersion.binary)