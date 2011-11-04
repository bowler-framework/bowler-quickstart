name := "bowler-quickstart"

version := "1.0-SNAPSHOT"

organization := "bowler"

scalaVersion := "2.9.0-1"

seq(webSettings :_*)

resolvers ++= Seq("Sonatype Nexus releases" at "https://oss.sonatype.org/content/repositories/releases", 
	"Sonatype Nexus snapshots" at "https://oss.sonatype.org/content/repositories/snapshots", "Scala-Tools repo" at "http://scala-tools.org/repo-releases/")

libraryDependencies ++= Seq(
	"org.bowlerframework" %% "core" % "0.5.1",
	"org.slf4j" % "slf4j-nop" % "1.6.0" % "runtime",
	"javax.servlet" % "servlet-api" % "2.5" % "provided",
	"org.eclipse.jetty" % "jetty-webapp" % "7.4.1.v20110513" % "jetty",
	"org.scalatra" %% "scalatra-scalatest" % "2.0.0.M4" % "test",
	"org.specs2" % "specs2_2.9.0" % "1.3" % "test"
	)
