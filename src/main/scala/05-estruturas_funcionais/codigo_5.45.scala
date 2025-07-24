package `05-estruturas_funcionais`

// Implementação do companion object da pilha funcional

object ListStack {
    def apply[T](): ListStack[T] = new ListStack[T]()
    def apply[T](elements: T*): ListStack[T] = new ListStack(elements.toList)
}