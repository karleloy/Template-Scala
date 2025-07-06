def typingTheLambda() = {
    val identity = (x: Int) => { x } //não precisa chaves
    val add = (x: Int, y: Int) => { x + y }
    val multiply = (x: Int, y: Int) => { x * y }

    println(s"Identidade de 5: ${identity(5)}")
    println(s"Soma de 5 e 3: ${add(5, 3)}")
    println(s"Multiplicação de 5 e 3: ${multiply(5, 3)}")
}

@main def run(): Unit = {
    typingTheLambda()
}