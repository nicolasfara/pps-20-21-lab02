package u02.es

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u02.es.Fibonacci._

class FibonacciTest {

  @Test def fibonacciTest(): Unit = {
    assertEquals(1, fib(1))
    assertEquals(3, fib(2))
    assertEquals(6, fib(3))
  }

  @Test def fibonacciTailRecTest(): Unit = {
    assertEquals(1, fibTailRec(1))
    assertEquals(3, fibTailRec(2))
    assertEquals(6, fibTailRec(3))
  }

}
