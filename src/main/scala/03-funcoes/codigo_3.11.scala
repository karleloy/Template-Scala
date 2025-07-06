val identity: (Int) => Int = x => x
val add: (Int, Int) => Int = (x, y) => x + y
val multiply: (Int, Int) => Int = (x, y) => x * y

@main def run1(): Unit = {
    println(s"Identidade de 5: ${identity(5)}")
    println(s"Soma de 5 e 3: ${add(5, 3)}")
    println(s"Multiplicação de 5 e 3: ${multiply(5, 3)}")
}