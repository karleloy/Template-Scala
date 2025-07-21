package `05-estruturas_funcionais`

//Definição de uma pilha funcional
trait Stack[T] {
    def push(x: T): Stack[T]
    def pop: (Option[T], Stack[T])
    def peek: Option[T]
    def isEmpty: Boolean
    def size: Int
}