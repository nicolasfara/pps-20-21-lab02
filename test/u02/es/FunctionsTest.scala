package u02.es

import org.junit.jupiter.api.Assertions.{assertFalse, assertTrue}
import org.junit.jupiter.api.Test
import u02.es.Functions._

class FunctionsTest {

    @Test def genericEmptyTest(): Unit = {
      val empty: String => Boolean = _ == ""
      val notEmpty = neg(empty) //type: String => Boolean

      assertTrue(notEmpty("foo"))
      assertFalse(notEmpty(""))
      assertTrue(notEmpty("Foo") && !notEmpty(""))
    }
}
