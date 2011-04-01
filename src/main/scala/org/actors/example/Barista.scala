package org.actors.example

import scala.actors._

class Barista extends Actor
{
  def act() = {
    loop {
      react {
        case c : Customer => c ! Coffee
        case _ => println("Can only prepare coffee for a customer, sorry")
      }
    }
  }
}