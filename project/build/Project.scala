import sbt._

class ExampleProject (info: ProjectInfo) extends DefaultProject(info)
{
  val guice = "com.google.inject" % "guice" % "2.0"
}