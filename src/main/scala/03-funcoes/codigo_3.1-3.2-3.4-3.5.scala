def sum(a: Int, b: Int): Int = a + b

@ main def readThenPrint(): Unit =
    val a = scala.io.StdIn.readInt()
    val b = scala.io.StdIn.readInt()

    println(s"A soma é: ${sum(a, b)}")

    // Aplicação da função
    val result = sum(3, 5)
    println(s"A soma é: $result")

    //Uso de parenteses
    def doublePi = 2 * math.Pi
    println(s"O dobro de Pi é: ${doublePi}")

    //Parâmetros com valores padrão
    def multiply(a: Int = 1, b: Int = 1): Int =
    a * b
    
    println(multiply(2, 3))
    println(multiply())
    println(multiply(4))