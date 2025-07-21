package `05-estruturas_funcionais`

//Implementação dos construtores secundários da pilha
def this() = this(List.empty[T], 0)
def this(elements: List[T]) = this(elements, elements.length)