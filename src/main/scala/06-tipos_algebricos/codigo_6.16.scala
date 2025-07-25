package `06-tipos_algebricos`

//Casamento de padrões em tipos produto
case class Point(x: Double, y: Double) {
    override def toString: String = this match {
        case Point(x, y) => s"Coordenadas: ($x, $y)"
    }
}

@main def runPointExample(): Unit = {
    val point = Point(3.0, 4.0)
    println(point.toString)
}