package `05-estruturas_funcionais`

//Implementação de uma pilha funcional com listas

class ListStack[T](val elements: List[T], override val size: Int) extends Stack[T] {
    def this() = ???
    def this(elements: List[T]) = ???
    override def push(x: T): Stack[T] = ???
    override def pop: (Option[T], Stack[T]) = ???
    override def peek: Option[T] = ???
    override def isEmpty: Boolean = ???
    override def toString: String = ???
}