//Método List.foreach
val numbers4 = List(1, 2, 3, 4, 5)

def printNumbers(): Unit = {
    numbers4.foreach(n => println(s"Número: $n"))
}

@main def run9(): Unit = {
    println(s"Números originais: $numbers4")
    printNumbers()
}