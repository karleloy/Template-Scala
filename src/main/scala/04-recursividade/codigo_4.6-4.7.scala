//recursiva na cauda para o problema de somar os números de a
//até b.
//  

package tailrecursivesum

//@tailrec
def tailRecursiveSum(a: Long, b: Long, acc: Long = 0): Long = {
    if (a > b) acc
    else tailRecursiveSum(a + 1, b, acc + a) //+ 0
}

@main def run(): Unit = {
    println(tailRecursiveSum(1, 10)) 
    println(tailRecursiveSum(5, 15)) 
    println(tailRecursiveSum(0, 100))
    println(tailRecursiveSum(1, 1_000_000))
}