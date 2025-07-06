//Método reduce com uma lista vazia
val emptyList = List.empty[Int]
val emptySum = emptyList.reduce((a, b) => a + b)

@main def run8(): Unit =
    println(s"Lista vazia: $emptyList")