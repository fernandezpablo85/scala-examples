package org.actors.example

import scala.actors._

import java.util.Random

class Barista extends Actor
{
  val rand = new Random

  def act() = {
    loop {
      react {
        case c : Customer =>
        {
          println("[barista] %s customers in line".format(mailboxSize))
          println("[barista] Preparing coffee for costumer "+c.id+"...")
          Thread.sleep(rand.nextInt(2000))
          c ! Coffee
        }
        case _ => println("[barista] Can only prepare coffee for a customer, sorry")
      }
    }
  }
}