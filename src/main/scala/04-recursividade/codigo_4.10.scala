//Função recursiva para calcular o fatorial de um número.
def factorialNaive(n: BigInt): BigInt = {
    if (n <= 1) 1
    else n * factorialNaive(n - 1)
}

@main def runFactorialNaive(): Unit = {
    println(factorialNaive(0))
    println(factorialNaive(1))
    println(factorialNaive(5))
    println(factorialNaive(10))
    println(factorialNaive(21))
}