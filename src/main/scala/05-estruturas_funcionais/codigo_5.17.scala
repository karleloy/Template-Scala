//Operações básicas com Vector

import scala.collection.immutable.Vector

@main def opBasicaArraySeq(): Unit =
    val numbers = Vector(1, 2, 3, 4, 5)
    println(numbers(0))
    println(numbers(2))
    println(numbers.length)
    println(numbers.isEmpty)
    println(numbers.contains(3))
    println(numbers.indexOf(4))
    println(numbers.lastIndexOf(2))

    println(numbers.updated(2, 10))
    println(numbers :+ 6)
    println(6 +: numbers)
    println(numbers ++ Vector(7, 8))
    println(numbers)