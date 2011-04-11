package org.example.implicits

// import org.example.implicits.MyString._
// import org.example.implicits.MyEvilString._

object MainImplicits
{
  implicit def local (original : String) = new MyString(original)
  
  def main (args : Array[String])
  {
    println("asdf".dasherize)
  }
}