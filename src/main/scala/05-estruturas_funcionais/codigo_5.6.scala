//Função recursiva na cauda para calcular a soma dos elementos de uma lista
def listSumTailRec(xs: List[Int]): Int = {
    def loop(xs: List[Int], acc: Int = 0): Int = {
    if (xs.isEmpty) acc
    else loop(xs.tail, acc + xs.head)
    }
    loop(xs)
}

@main def testListSumTailRec(): Unit = {
    println(listSumTailRec(List(1, 2, 3)))
    println(listSumTailRec(List(4, 5, 6)))
    println(listSumTailRec(Nil))
    println(listSumTailRec(List(10)))
}