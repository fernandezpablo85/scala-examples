package org.language;

class MyString(val string : String) {

  def dasherize() = {
    string mkString "-"
  }
}

object LanguageMain
{
  implicit def toMyString(string:String) = new MyString(string)

  def main (args : Array[String])
  {
    testImplicits
  }

  def testImplicits ()
  {
    println("pablo".dasherize);
  }
}
