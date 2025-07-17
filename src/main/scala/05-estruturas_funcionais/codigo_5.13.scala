//package `05-estruturas_funcionais`

//Função iterativa para concatenar duas listas

def concatenateIterative[A](xs: List[A], ys: List[A]): List[A] = {
    var zs = ys
    var rs = xs.reverse
    while (rs.nonEmpty) {
        zs = rs.head :: zs
        rs = rs.tail
    }
    zs
}
@main def testConcatenateIterative(): Unit = {
    println(concatenateIterative(List(1, 2), List(3, 4))) 
    println(concatenateIterative(List("a", "b"), List("c", "d"))) 
    println(concatenateIterative(Nil, List(42))) 
}