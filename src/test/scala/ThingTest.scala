import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers
import scala.collection.mutable.Stack

import org.example.autotest.Thing

class ThingTest extends Spec with ShouldMatchers {

  describe("A Thing") 
  {
    val thing = new Thing("table")

    it("should have a name") 
    {
      thing.name should be ("table")
    }
  }
}