//package `05-estruturas_funcionais`

//Função iterativa para inverter uma lista

def reverseIterative[A](xs: List[A]): List[A] = {
    var ys: List[A] = Nil
    var remaining = xs
    while (!remaining.isEmpty) {
        ys = remaining.head :: ys
        remaining = remaining.tail
    }
    ys
}

@main def testReverseIterative(): Unit = {
    println(reverseIterative(List(1, 2, 3))) 
    println(reverseIterative(List("a", "b", "c"))) 
    println(reverseIterative(Nil)) 
}