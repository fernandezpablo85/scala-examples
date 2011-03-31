package org.actors.example

object Main
{
  val MAX_CLEINTS = 25;
  
  def main (args : Array[String])
  {
    println("Starting simulation");
    val customers = generateCustormers();
  }
  
  private def generateCustormers() = {
    import java.util.Random;
    
    val total = new Random().nextInt(Main.MAX_CLEINTS);
    println("Creating " + total + " customers");
    Vector.fill(total)(new Customer)
  }
}