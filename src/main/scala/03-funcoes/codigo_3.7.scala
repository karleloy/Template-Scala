//Parâmetros com valores padrão
@main def valoresPadrão(): Unit = 
    def multiply(a: Int = 1, b: Int = 1): Int =
        a * b
    
    println(multiply(2, 3))
    println(multiply())
    println(multiply(4))