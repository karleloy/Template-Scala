//Função iterativa para calcular o n‐ésimo número de Fibonacci
def fibonacciIterative(n: Int): Int = {
    if (n == 0) return 0
    if (n == 1) return 1

    var a = 0
    var b = 1
    var i = 2

    while (i <= n) {
        val temp = a + b
        a = b
        b = temp
        i += 1
    }

    return b
}

@main def runFibonacciIterative(): Unit = {
    println((0 until 15).map(fibonacciIterative))
}