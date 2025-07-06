//Método List.reduce
val numbers2 = List(1, 2, 3, 4, 5)
val sum1 = numbers2.reduce((a, b) => a + b)
val product = numbers2.reduce((a, b) => a * b)

@main def run5(): Unit = {
    println(s"Números originais: $numbers2")
    println(s"Soma: $sum1")
    println(s"Produto: $product")
}