package `06-tipos_algebricos`

//Definição de um tipo soma para formas geométricas
sealed trait Shape
case class Circle(radius: Double) extends Shape
case class Rectangle(width: Double, height: Double) extends Shape
case class Triangle(base: Double, height: Double) extends Shape

//Cálculo da área de uma forma geométrica usando condicionais if-else
def area(shape: Shape): Option[Double] = {
    if (shape.isInstanceOf[Circle]) {
        val circle = shape.asInstanceOf[Circle]
        Some(Math.PI * circle.radius * circle.radius)
    } else if (shape.isInstanceOf[Rectangle]) {
        val rectangle = shape.asInstanceOf[Rectangle]
        Some(rectangle.width * rectangle.height)
    } else if (shape.isInstanceOf[Triangle]) {
        val triangle = shape.asInstanceOf[Triangle]
        Some(0.5 * triangle.base * triangle.height)
    } else {
        None
    }
}

@main def runAreaCalculations(): Unit = {
    val shapes: List[Shape] = List(
    Circle(5),
    Rectangle(4, 6),
    Triangle(3, 7)
    )

    shapes.foreach { shape =>
        val result = area(shape)

        println(s"Área: ${result.getOrElse("Desconhecida")}")
    }
}