package org.actors.real

object Main 
{
  def main (args : Array[String])
  {
    val log = new Log
    
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
    
    for (i <- 1 to 100) 
    {
      log info "inside the loop, iteration"+i
    }
  }
}