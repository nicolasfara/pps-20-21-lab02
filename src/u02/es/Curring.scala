package u02.es

object Curring {
  val p1: Int => Int => Int => Boolean = x => y => z => x <= y && y <= z
  val p2: (Int, Int, Int) => Boolean = (x, y, z) => x <= y && y <= z
  def p3(x: Int)(y: Int)(z: Int): Boolean = x <= y && y <= z
  def p4(x: Int, y: Int, z: Int): Boolean = x <= y && y <= z

  def compose(f: Int => Int, g: Int => Int): Int => Int = x => f(g(x))

  def genericCompose[A](f: A => A, g: A => A): A => A = x => f(g(x))
}
