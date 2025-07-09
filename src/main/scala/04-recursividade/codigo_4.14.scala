//Função recursiva para calcular o n‐ésimo número de Fibonacci.
def fibonacciNaive(n: BigInt): BigInt = {
    if (n == 0) BigInt(0)
    else if (n == 1) BigInt(1)
    else fibonacciNaive(n - 1) + fibonacciNaive(n - 2)
}

@main def runFibonacciNaive(): Unit = {
    println((0 until 47).map(n => fibonacciNaive(n)))
}