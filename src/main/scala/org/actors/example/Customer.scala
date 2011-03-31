package org.actors.example

class Customer
{
  var served = false;
  
  def serve()
  {
    served  = true;
  }
}