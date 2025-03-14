scalacOptions ++= Seq("-deprecation", "-feature")

addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "1.1.3")
addSbtPlugin("com.github.sbt" % "sbt-sdlc" % "0.3.0")
addSbtPlugin("de.johoop" % "sbt-testng-plugin" % "3.1.1")
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "2.0.9")
addSbtPlugin("ch.epfl.scala" % "sbt-version-policy" % "2.1.3")
addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.5.12")
addSbtPlugin("com.lightbend.paradox" % "sbt-paradox" % "0.10.6")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.10.0")
