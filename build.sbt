name := "bowler-quickstart"

version := "1.0-SNAPSHOT"

organization := "bowler"

scalaVersion := "2.9.1"

seq(webSettings :_*)

resolvers ++= Seq(
  "Sonatype Nexus releases" at "http://oss.sonatype.org/content/repositories/releases",
  "Sonatype Nexus snapshots" at "http://oss.sonatype.org/content/repositories/snapshots"
)

libraryDependencies ++= Seq(
  "org.bowlerframework" %% "core" % "0.6",
  "org.bowlerframework" %% "squeryl-mapper" % "0.6",
  "com.h2database" % "h2" % "1.3.155",
  "c3p0" % "c3p0" % "0.9.1.2",
  "org.slf4j" % "slf4j-nop" % "1.6.4" % "runtime",
  "javax.servlet" % "servlet-api" % "2.5" % "provided",
  "org.eclipse.jetty" % "jetty-webapp" % "7.4.1.v20110513" % "container",
  "org.scalatra" %% "scalatra-scalatest" % "2.1.0-SNAPSHOT" % "test",
  "org.specs2" %% "specs2" % "1.8.2" % "test"
)
