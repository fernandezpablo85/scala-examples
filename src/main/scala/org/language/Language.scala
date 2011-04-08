package org.language;

import java.io._

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
    testClosures
    testImplicits
    testTailRecursion
  } 

  def testImplicits ()
  {
    println("pablo".dasherize);
  }

  def testClosures ()
  {
    val lang = "Scala"

    using ("pablo.txt") { file =>
      file println "hola archivito"
      file println "estoy usando "+lang+" para escribirte"
    } 
  }

  def testTailRecursion ()
  {
    explodeIn(10)
  }

  def explodeIn (time : Int)
  {
    if (time == 0)
    {
      throw new Exception("Boom")
    }
    else
    {
      explodeIn(time - 1)
    }
    println("Should never reach here")
  }

  def using (name : String)(op : PrintWriter => Unit) {
    var f : File = null
    var w : PrintWriter = null

    try
    { 
      f = new File(name)
      w = new PrintWriter(f)
      op(w) 
    }
    catch
    {
      case e : Exception => println("Something went wrong");
    }
    finally
    {
      w.close
    }
  }
}
