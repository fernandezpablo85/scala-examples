package org.actors.example

import scala.actors._

class Shop (val name : String) extends Actor
{
  def act() = {
    loop {
      react {
        case customer : Customer => println(Shop.WELCOME_MESSAGE.format(name, customer.id))
        case _ => println(Shop.NOT_ALLOWED_MESSAGE .format(name))
      }
    }
  }
}

object Shop
{
  val WELCOME_MESSAGE = "Welcome to %s customer number %s"
  val NOT_ALLOWED_MESSAGE = "Only customers are allowed in %s"
}