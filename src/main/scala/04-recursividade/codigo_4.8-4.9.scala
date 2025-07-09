import scala.annotation.tailrec

def declarativeSum(a: Long, b: Long): Long = {
    //Função recursiva auxiliar para emular um loop imperativo.
    @tailrec
    def loopHelper(i: Long, sum: Long, b: Long): Long = {
        if (i > b) sum
        else loopHelper(i + 1, sum + i, b)
    }

    if (a > b) 0
    else loopHelper(a, 0, b)
}

@main def runDeclarativeSum(): Unit = {
    println(declarativeSum(1, 10)) 
    println(declarativeSum(5, 15)) 
    println(declarativeSum(0, 100))
    println(declarativeSum(1, 1_000_000))
}