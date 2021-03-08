package u02.es

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u02.es.Fibonacci._

class FibonacciTest {

  @Test def fibonacciTest(): Unit = {
    assertEquals(0, fib(0))
    assertEquals(1, fib(1))
    assertEquals(1, fib(2))
    assertEquals(2, fib(3))
    assertEquals(3, fib(4))
  }

  @Test def fibonacciTailRecTest(): Unit = {
    assertEquals(0, fibTailRec(0))
    assertEquals(1, fibTailRec(1))
    assertEquals(1, fibTailRec(2))
    assertEquals(2, fibTailRec(3))
    assertEquals(3, fibTailRec(4))
  }

}
