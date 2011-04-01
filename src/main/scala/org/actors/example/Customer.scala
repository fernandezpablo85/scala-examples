package org.actors.example

import scala.actors._

case object Coffee

class Customer(val id: Int) extends Actor {
  
  var served = false;

  def act() = {
    loop {
      react {
        case Coffee => {
          this.served = true
          println("[customer] Customer "+id+" got a coffee");
          exit()
        }
      }
    }
  }
}