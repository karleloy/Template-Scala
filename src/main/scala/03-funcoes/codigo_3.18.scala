//Método reduce com uma lista de um único elemento
val singleElementList = List(42)
val singleElementSum = singleElementList.reduce((a, b) => a + b)

@main def run7(): Unit =
    println(s"Lista com um único elemento: $singleElementList")
    println(s"Soma: $singleElementSum")