package u02.es

import org.junit.jupiter.api.Assertions.{assertEquals, assertThrows, assertTimeout}
import org.junit.jupiter.api.{Assertions, Test}
import org.junit.jupiter.api.function.Executable
import org.opentest4j.AssertionFailedError
import u02.es.Fibonacci._

import java.time.Duration.ofSeconds


class FibonacciTest {

  private val expectedFibonacciValue = List(0, 1, 1, 2, 3)

  @Test def fibonacciTest(): Unit = {
    testFibonacci(fib)
  }

  @Test def fibonacciTailRecTest(): Unit = {
    testFibonacci(fibTailRec)
  }

  @Test def testBigNumber(): Unit = {
    assertThrows(classOf[StackOverflowError], () => {
      fib(32145)
    })
  }

  @Test def testBigNumberTailRec(): Unit = {
    assertEquals(-636952734, fibTailRec(32145))
  }

  private def testFibonacci(fibonacci: Int => Int): Unit = {
    expectedFibonacciValue.zipWithIndex foreach {
      case (element, i) => assertEquals(element, fibonacci(i))
    }
  }
}
