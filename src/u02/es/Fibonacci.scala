package u02.es

import scala.annotation.tailrec

object Fibonacci {

  def fib(value: Int): Int = value match {
    case v if v > 0 => value + fib(value-1)
    case _ => 0
  }

  def fibTailRec(value: Int): Int = {
    @tailrec
    def _fib(value: Int, current: Int): Int = value match {
      case v if v > 0 => _fib(value - 1, current + value)
      case _ => current
    }
    _fib(value, 0)
  }
}
