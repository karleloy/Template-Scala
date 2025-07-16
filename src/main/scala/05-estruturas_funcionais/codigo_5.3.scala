package `05-estruturas_funcionais`
//Função recursiva para calcular o tamanho de uma lista

package listSize

def listSize(xs: List[A]): Int = {
    if (xs == Nil) 0
    else 1 + listSize(xs.tail)
}

@main def testListSize(): Unit = {
    println(listSize(Nil))
    println(listSize(List(1, 2, 3)))
    println(listSize(List("a", "b")))
    println(listSize(List()))
}