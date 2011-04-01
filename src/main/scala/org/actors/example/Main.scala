package org.actors.example

case object Pet

object Main
{
  val MAX_CLIENTS = 15;
  
  def main (args : Array[String])
  {
    println("[Main] Starting simulation");

    // Generate Customer actors and start them
    val customers = generateCustormers();
    customers.foreach { customer => customer.start() }

    // Create the shop and put it to work
    val shop = new Shop("Starbucks")
    shop.start;

    // Send customers to the shop
    customers foreach { customer => shop ! customer }

    // Send a pet to the shop
    shop ! Pet
  }
  
  private def generateCustormers() = {
    import java.util.Random;
    
    val total = new Random().nextInt(Main.MAX_CLIENTS);
    println("[Main] Creating "+total+" customers");

    (1 to total).map(new Customer(_))
  }
}