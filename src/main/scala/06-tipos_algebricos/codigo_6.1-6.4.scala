package `06-tipos_algebricos`

//Criação de uma tupla chamada point contendo dois valores
val point = (3.0, 4.0)

//Criação de uma nova tupla com um elemento modificado
val updatedPoint = point.copy(_2 = 5.0)

//Criação de uma tupla com elementos de tipos diferentes
val mixedTuple = (42, "Hello", true)

@main def expTuplas(): Unit =
    println(point._1) 
    println(point._2)
    println(updatedPoint)
    println(mixedTuple._1) 
    println(mixedTuple._2) 
    println(mixedTuple._3)