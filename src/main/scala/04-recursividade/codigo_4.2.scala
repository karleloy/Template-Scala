//Solução recursiva para o problema de somar os números de a até b.

package recursivesum

def recursiveSum(a: Long, b: Long): Long =
    if (a > b) 0
    else a + recursiveSum(a + 1, b)

@main def run(): Unit = {
    println(recursiveSum(1, 10)) // Output: 55
    println(recursiveSum(5, 15)) // Output: 110
    println(recursiveSum(0, 100)) // Output: 5050
}