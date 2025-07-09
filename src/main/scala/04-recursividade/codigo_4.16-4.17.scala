// Implementação de uma função memoizadora com um argumento.
import scala.collection.mutable

def memoize[I, O](f: I => O): I => O = {
    val cache = mutable.Map.empty[I, O]
    
    (arg: I) => cache.getOrElseUpdate(arg, f(arg))
}

//Função recursiva de Fibonacci com memoização.
val fibonacciMemoized: BigInt => BigInt = memoize { n =>
    if (n == 0) BigInt(0)
    else if (n == 1) BigInt(1)
    else fibonacciMemoized(n - 1) + fibonacciMemoized(n - 2)
}

@main def runFibonacciMemoized(): Unit = {
    println((0 until 15).map(n => fibonacciMemoized(BigInt(n))))
}