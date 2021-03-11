package u02.es

object Shapes {
  sealed trait Shape
  case class Rectangle(width: Double, height: Double) extends Shape
  case class Circle(radius: Double) extends Shape
  case class Square(side: Double) extends Shape

  def perimeter(shape: Shape): Double = shape match {
    case Rectangle(width, height) => width * 2 + height * 2
    case Circle(radius) => radius * 2 * Math.PI
    case Square(side) => side * 4
  }

  def area(shape: Shape): Double = shape match {
    case Rectangle(width, height) => width * height
    case Circle(radius) => radius * radius * Math.PI
    case Square(side) => side * side
  }
}
