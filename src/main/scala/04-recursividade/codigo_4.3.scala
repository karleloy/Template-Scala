//Solução recursiva para o problema de somar os números de a até b com
//profundidade alta.
package recursivestackoverflow

import recursivesum.recursiveSum

@main def run(): Unit = {
    try {
        println(recursiveSum(1, 1_000_000))
    } catch {
        case e: StackOverflowError => {
            println("Stack overflow occurred")
        }
    }
}