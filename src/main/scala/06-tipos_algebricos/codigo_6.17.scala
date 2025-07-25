package `06-tipos_algebricos`

//Definição de um tipo produto com método unapply
class Point2(val x: Double, val y: Double)

object Point2 {
    def apply(x: Double, y: Double): Point2 = new Point2(x, y)

    def unapply(point: Point2): (Double, Double) = (point.x, point.y)
}

@main def testPoint2 = {
    val point = Point2(3.0, 4.0)
    val Point2(x, y) = point

    println(s"Point coordinates: x = $x, y = $y")
}