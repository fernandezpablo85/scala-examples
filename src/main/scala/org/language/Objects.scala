class Person (val name : String)
{
  private val bankNumber = "666"
  
  def tellSecret() = 
  {
    Person.SECRET
  }
}

object Person
{
  val TABLE = "people_table"
  private val SECRET = "psssst... this is secret stuff"
  
  def stealBankNumber (person : Person) =
  {
    person.bankNumber
  }
}

object MainObjects
{
  def main (args : Array[String])
  {
    // static-like access to object's non-private members
    println(Person.TABLE)
    
    // This won't compile since SECRET is 'private'
    //println(Person.SECRET)
    
    // But an instance of a companion class  
    // can access private members from his companion object
    val guy = new Person("john")
    println(guy.tellSecret) 
    
    // And vice-versa
    val secret = Person.stealBankNumber(guy)
    println("stolen bank number: "+secret)
    
    // objects do not define types, this won't compile
    // val ref : MainObjects = MainObjects
  }
}