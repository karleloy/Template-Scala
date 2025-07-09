//Função recursiva na cauda para calcular o fatorial de um número, a
//partir de uma função imperativa.
import scala.annotation.tailrec

def factorialFromImperative(n: BigInt): BigInt = {

@tailrec
def loopHelper(i: BigInt, acc: BigInt): BigInt = {
    if (i <= 1) acc
    else loopHelper(i - 1, acc * i)
}
    loopHelper(n, 1)
}
@main def runFactorialFromImperative(): Unit = {
    println(factorialFromImperative(0))
    println(factorialFromImperative(1))
    println(factorialFromImperative(5))
    println(factorialFromImperative(10))
    println(factorialFromImperative(21))
}