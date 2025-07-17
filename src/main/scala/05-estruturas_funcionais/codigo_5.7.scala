//package `05-estruturas_funcionais`

//Função recursiva para adicionar um elemento no final de uma lista

package append

def append[A](xs: List[A], elem: A): List[A] = {
    if (xs.isEmpty) List(elem)
    else xs.head :: append(xs.tail, elem)
}
@main def testAppend(): Unit = {
    println(append(List(1, 2, 3), 4)) 
    println(append(List("a", "b"), "c")) 
    println(append(Nil, 42))
}