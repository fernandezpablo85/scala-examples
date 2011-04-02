package org.actors.real

import com.google.inject._

object Main 
{
  def main (args : Array[String])
  {
    val injector = Guice.createInjector(new org.actors.real.Module)
    val service = injector.getInstance(classOf[SampleService])
    service.print()
  }

  def excerciseLog (log : ILog)
  {
    log info "Starting loop"
    log info "going to make a division"
    
    try
    {
      1 / 0
    }
    catch
    {
      case e : Exception => log error "Problem while making division"
    }
    
    for (i <- 1 to 1000)
    {
      log info "inside the loop, iteration"+i
    }
  }
}