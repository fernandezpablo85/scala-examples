import sbt._

class ExampleProject (info: ProjectInfo) extends DefaultProject(info) with growl.GrowlingTests
{
  val guice = "com.google.inject" % "guice" % "2.0"
  val scalaTest =  "org.scalatest" % "scalatest" % "1.0"
}
