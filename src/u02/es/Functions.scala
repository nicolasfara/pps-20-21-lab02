package u02.es

object Functions {

  val parityLiteral: Int => String = {
    case v if v % 2 == 0 => "Even"
    case _ => "Odd"
  }

  def parityMethod(value: Int): String = value match {
    case v if v % 2 == 0 => "Even"
    case _ => "Odd"
  }

  val neg: (String => Boolean) => String => Boolean = (pred: String => Boolean) => (x: String) => !pred(x)

  def negMethod[A](predicate: A => Boolean): A => Boolean = x => !predicate(x)
}
