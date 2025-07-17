//package `05-estruturas_funcionais`

def reverseNaive[A](xs: List[A]): List[A] = {
    if (xs.isEmpty) Nil
    else reverseNaive(xs.tail) :+ xs.head
}

@main def testReverseNaive(): Unit = {
    println(reverseNaive(List(1, 2, 3))) 
    println(reverseNaive(List("a", "b", "c"))) 
    println(reverseNaive(Nil)) 
}