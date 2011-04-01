package org.actors.real.benchmarks

import org.actors.real._

object Benchmarks
{
  def main(args:Array[String])
  {
    val jts = System.currentTimeMillis
    Main.excerciseLog(new Log)
    println("Java took %d milliseconds".format(System.currentTimeMillis - jts))

    val sts = System.currentTimeMillis
    Main.excerciseLog(new SLog)
    println("Scala took %d milliseconds".format(System.currentTimeMillis - sts))
  }
}