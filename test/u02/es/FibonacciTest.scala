package u02.es

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u02.es.Fibonacci._

class FibonacciTest {

  private val expectedFibonacciValue = List(0, 1, 1, 2, 3)

  @Test def fibonacciTest(): Unit = {
    testFibonacci(fib)
  }

  @Test def fibonacciTailRecTest(): Unit = {
    testFibonacci(fibTailRec)
  }

  private def testFibonacci(fibonacci: Int => Int): Unit = {
    expectedFibonacciValue.zipWithIndex foreach {
      case (element, i) => assertEquals(element, fibonacci(i))
    }
  }
}
