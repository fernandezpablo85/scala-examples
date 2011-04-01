package org.actors.real.benchmarks

import org.actors.real._

import java.io._

object Benchmarks
{
  def main(args:Array[String])
  {
    deleteAllLogs
    
    val jts = System.currentTimeMillis
    Main.excerciseLog(new Log)
    println("Java took %d milliseconds".format(System.currentTimeMillis - jts))

    val sts = System.currentTimeMillis
    Main.excerciseLog(new SLog)
    println("Scala took %d milliseconds".format(System.currentTimeMillis - sts))
    
    val ats = System.currentTimeMillis
    val log = new ALog
    log.start()
    Main.excerciseLog(log)
    println("Scala (actors) took %d milliseconds".format(System.currentTimeMillis - ats))
  }
  
  def deleteAllLogs ()
  {
    new File("./example.log").delete
    new File("./example.scala.log").delete
    new File("./example.actor.log").delete
  }
}