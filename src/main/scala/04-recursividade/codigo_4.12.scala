//Função imperativa para calcular o fatorial de um número.
def factorialImperative(n: BigInt): BigInt = {
    var result: BigInt = 1
    var i: BigInt = n

    while (i > 1) {
    result *= i
    i -= 1
    }
    result
}

@main def runFactorialImperative(): Unit = {
    println(factorialImperative(0))
    println(factorialImperative(1))
    println(factorialImperative(5))
    println(factorialImperative(10))
    println(factorialImperative(21))
}