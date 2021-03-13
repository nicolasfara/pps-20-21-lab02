package u02.es

import org.junit.jupiter.api.Assertions.{assertEquals, assertTimeout}
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
    Assertions.assertThrows(classOf[AssertionFailedError], () => {
      assertTimeout(ofSeconds(2), new Executable {
        override def execute(): Unit = {
          fib(48)
        }
      })
    })
  }

  @Test def testBigNumberTailRec(): Unit = {
    assertTimeout(ofSeconds(2), new Executable {
      override def execute(): Unit = {
        assertEquals(512559680, fibTailRec(48))
      }
    })
  }

  private def testFibonacci(fibonacci: Int => Int): Unit = {
    expectedFibonacciValue.zipWithIndex foreach {
      case (element, i) => assertEquals(element, fibonacci(i))
    }
  }
}
