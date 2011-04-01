package org.actors.real

import java.io._

class SLog extends ILog
{
  val f = new File("./example.scala.log")

  def info (s : String) { append("[info]"+s+"\n") }
  def error (s : String) { append("[error]"+s+"\n") }

  def append (s : String)
  {
     val fw = new FileWriter(f,true)
     fw.append(s)
     fw.close
  }
}