package org.actors.real

import scala.actors._

import java.io._

case class Info (val message : String)
case class Error (val message : String)

class ALog extends Actor with ILog
{
  val f = new File("./example.actor.log")

  def act () 
  {
    loop {
      react {
        case info : Info =>   append("[info]"+info.message+"\n")
        case error : Error => append("[ERROR]"+error.message+"\n")
      }
    }
  }
  
  def info (message : String) 
  {
    this ! Info(message) 
  }
  
  def error (message : String)
  {
    this ! Error(message)
  }
  
  private def append (message : String)
  {
    val fw = new FileWriter(f,true)
    fw.append(message)
    fw.close
  }
}