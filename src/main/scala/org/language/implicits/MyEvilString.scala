package org.example.implicits

object MyEvilString
{
  implicit def string2evil (original : String) = new MyEvilString(original)
}

class MyEvilString (original : String)
{
  def dasherize = throw new Exception("HAHAHA")
}