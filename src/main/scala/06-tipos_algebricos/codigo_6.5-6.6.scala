package `06-tipos_algebricos`

//Definição de uma case class chamada Point com dois componentes
case class Point(x: Double, y: Double)

//Exemplo de uso da case class Point
val p1 = Point(3.0, 4.0)
val p2 = Point(5.0, 6.0)

val p3 = p1.copy(y = 5.0)

@main def expCaseClass(): Unit =
    println(p1)
    println(p1.x)
    println(p1.y)
    println(p1 == p2)
    println(p1)
    println(p2)
    println(p3)