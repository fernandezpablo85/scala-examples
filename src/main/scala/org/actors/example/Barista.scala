package org.actors.example

import scala.actors._

class Barista extends Actor
{
  def act() = {
    loop {
      react {
        case c : Customer =>
        {
          println("[barista] Preparing coffee for costumer "+c.id)
          c ! Coffee
        }
        case _ => println("[barista] Can only prepare coffee for a customer, sorry")
      }
    }
  }
}