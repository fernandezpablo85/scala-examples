class TailRecursion
{
  final def explodeIn (time : Int)
  {
    if (time == 0)
    {
      throw new Exception("BOOM")
    }
    else
    {
      explodeIn(time-1)
    }
    println("not tail recursive")
  }
}

object MainTailRecursion
{
  def main (args : Array[String])
  {
    val tail = new TailRecursion
    tail.explodeIn(5)
  }
}