package `06-tipos_algebricos`

//Amarração do tipo produto em casamento de padrões
case class Point(x: Double, y: Double)

def printPointInfo(point: Point): String = point match {
case p @ Point(x, y) =>
s"Point info: ${p}, x: $x, y: $y"
}

@main def runPointExample(): Unit = {
    val point = Point(1.0, 2.0)
    println(printPointInfo(point))
}