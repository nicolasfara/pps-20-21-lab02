package u02.es

object Shapes {
  sealed trait Shape
  case class Rectangle(l1: Double, l2: Double) extends Shape
  case class Circle(radius: Double) extends Shape
  case class Square(l: Double) extends Shape

  def perimeter(shape: Shape): Double = shape match {
    case Rectangle(l1, l2) => l1 * 2 + l2 * 2
    case Circle(radius) => radius * 2 * Math.PI
    case Square(l) => l * 4
  }

  def area(shape: Shape): Double = shape match {
    case Rectangle(l1, l2) => l1 * l2
    case Circle(radius) => radius * radius * Math.PI
    case Square(l) => l * l
  }
}
