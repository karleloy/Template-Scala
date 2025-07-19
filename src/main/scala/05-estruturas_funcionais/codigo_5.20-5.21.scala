//Definição e implementação de um trait para uma estrutura de dados do tipo pilha imutável

trait Stack[T] {
    def push(x: T): Stack[T]
    def pop: (T, Stack[T])
    def isEmpty: Boolean
    def size: Int
}

//Implementação de um trait para pilha
class ListStack[T] extends Stack[T] {
    override def push(x: T): Stack[T] = ???
    override def pop: (T, Stack[T]) = ???
    override def isEmpty: Boolean = ???
    override def size: Int = ???
}

class ArrayStack[T] extends Stack[T] {
    override def push(x: T): Stack[T] = ???
    override def pop: (T, Stack[T]) = ???
    override def isEmpty: Boolean = ???
    override def size: Int = ???
}

//??? indica ao compilador que os métodos ainda não foram implementados, 
//mas que serão implementados posteriormente