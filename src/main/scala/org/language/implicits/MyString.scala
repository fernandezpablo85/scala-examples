package org.example.implicits

class MyString (original : String)
{
  def dasherize () =
  {
    original.mkString("-")
  }
}

object MyString
{
  implicit def string2MyString (original : String) = new MyString(original)
}