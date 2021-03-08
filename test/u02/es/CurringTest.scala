package u02.es

import org.junit.jupiter.api.Assertions.{assertEquals, assertTrue}
import org.junit.jupiter.api.Test
import u02.es.Curring._

class CurringTest {

  @Test def curringTest(): Unit = {
    assertTrue(p1(2)(3)(4))
    assertTrue(p2(2, 3, 4))
    assertTrue(p3(2)(3)(4))
    assertTrue(p4(2, 3, 4))
  }

  @Test def composeTest(): Unit = {
    assertEquals(9, compose(_-1, _*2)(5))
  }

  @Test def genericComposeOnInt(): Unit = {
    assertEquals(9, genericCompose[Int](_-1, _*2)(5))
  }

  @Test def genericComposeOnString(): Unit = {
    assertEquals("MyHelloWorld", genericCompose[String](_ + "World", _ + "Hello")("My"))
  }
}
