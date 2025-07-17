//package `05-estruturas_funcionais`

//Função recursiva na cauda para concatenar duas listas

def concatenateTailRec[A](xs: List[A], ys: List[A]): List[A] = {
    @scala.annotation.tailrec
    def loop(rs: List[A], zs: List[A]): List[A] = {
        if (rs.isEmpty) zs
        else loop(rs.tail, rs.head :: zs)
}
    loop(xs.reverse, ys)
}

@main def testConcatenateTailRec(): Unit = {
    println(concatenateTailRec(List(1, 2), List(3, 4))) 
    println(concatenateTailRec(List("a", "b"), List("c", "d"))) 
    println(concatenateTailRec(Nil, List(42))) 
}