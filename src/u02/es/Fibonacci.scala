package u02.es

import scala.annotation.tailrec

object Fibonacci {

  def fib(value: Int): Int = value match {
    case v if v > 1 => fib(value-1) + fib(value - 2)
    case v if v == 1 => 1
    case _ => 0
  }

  def fibTailRec(value: Int): Int = {
    @tailrec
    def _fib(value: Int, first: Int, second: Int): Int = value match {
      case v if v > 0 => _fib(value - 1, second, first + second)
      case _ => first
    }
    _fib(value, 0, 1)
  }
}
