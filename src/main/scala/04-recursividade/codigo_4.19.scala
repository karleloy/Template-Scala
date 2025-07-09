//Função recursiva na cauda para calcular o n‐ésimo número de Fibonacci.
import scala.annotation.tailrec 

def fibonacciTailRecursive(n: BigInt): BigInt = {
    @tailrec
    def loop(i: BigInt, a: BigInt, b: BigInt): BigInt = {
        if (i > n) b
        else loop(i + 1, b, a + b)
    }

    if (n == 0) 0
    else if (n == 1) 1
    else loop(2, 0, 1)
}

@main def runFibonacciTailRecursive(): Unit = {
    println((0 until 15).map(x => fibonacciTailRecursive(x)))
}