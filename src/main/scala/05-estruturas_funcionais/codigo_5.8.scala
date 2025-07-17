//Função recursiva na cauda para adicionar um elemento no final de uma lista

def appendTailRec[A](xs: List[A], elem: A): List[A] = {
    @scala.annotation.tailrec
    def loop(xs: List[A], acc: List[A]): List[A] = {
        if (xs.isEmpty) (elem :: acc).reverse
        else loop(xs.tail, xs.head :: acc)
    }
    loop(xs, Nil)
}

@main def testAppendTailRec(): Unit = {
    println(appendTailRec(List(1, 2, 3), 4)) 
    println(appendTailRec(List("a", "b"), "c"))
    println(appendTailRec(Nil, 42))
}