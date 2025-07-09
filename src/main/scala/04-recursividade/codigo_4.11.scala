//Função recursiva na cauda para calcular o fatorial de um número.
def factorialTailRecursive(n: BigInt, acc: BigInt = 1): BigInt = {
    if (n <= 1) acc
    else factorialTailRecursive(n - 1, acc * n)
}

@main def runFactorialTailRecursive(): Unit = {
    println(factorialTailRecursive(0))
    println(factorialTailRecursive(1))
    println(factorialTailRecursive(5))
    println(factorialTailRecursive(10))
    println(factorialTailRecursive(21))
}