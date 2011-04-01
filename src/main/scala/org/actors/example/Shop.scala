package org.actors.example

import scala.actors._

class Shop (val name : String) extends Actor
{

  def act() = {
    loop {
      react {
        // case customer : Customer => do something with our customer
        case _ => println("Only customers are allowed in "+name)
      }
    }
  }
}