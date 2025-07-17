//package `05-estruturas_funcionais`

package concat

def concatenate[A](xs: List[A], ys: List[A]): List[A] = {
    if (xs.isEmpty) ys
    else xs.head :: concatenate(xs.tail, ys)
}

@main def testConcatenate(): Unit = {
    println(concatenate(List(1, 2), List(3, 4)))
    println(concatenate(List("a", "b"), List("c", "d"))) 
    println(concatenate(Nil, List(42))) 
}