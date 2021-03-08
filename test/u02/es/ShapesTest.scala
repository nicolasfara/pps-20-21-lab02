package u02.es

import org.junit.jupiter.api.Assertions.assertEquals
import u02.es.Shapes._
import org.junit.jupiter.api.Test

class ShapesTest {

  val rectangle: Rectangle = Rectangle(10, 20)
  val circle: Circle = Circle(10)
  val square: Square = Square(12.3)

  @Test def testRectanglePerimeter(): Unit = {
    assertEquals(60, perimeter(rectangle))
  }

  @Test def testCirclePerimeter(): Unit = {
    assertEquals(62.8, perimeter(circle), 0.1)
  }

  @Test def testSquarePerimeter(): Unit = {
    assertEquals(49.2, perimeter(square))
  }

  @Test def testRectangleArea(): Unit = {
    assertEquals(200, area(rectangle))
  }

  @Test def testCircleArea(): Unit = {
    assertEquals(314.15, area(circle), 0.1)
  }

  @Test def testSquareArea(): Unit = {
    assertEquals(151.29, area(square), 0.000001)
  }
}
