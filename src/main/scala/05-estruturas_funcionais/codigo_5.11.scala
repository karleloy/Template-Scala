//package `05-estruturas_funcionais`

//Função recursiva na cauda para inverter uma lista

def reverseTailRec[A](xs: List[A]): List[A] = {
    def loop(remaining: List[A], ys: List[A]): List[A] = {
        if (remaining.isEmpty) ys
        else loop(remaining.tail, remaining.head :: ys)
}
    loop(xs, Nil)
}

@main def testReverseTailRec(): Unit = {
    println(reverseTailRec(List(1, 2, 3))) 
    println(reverseTailRec(List("a", "b", "c"))) 
    println(reverseTailRec(Nil)) 
}