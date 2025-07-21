package `05-estruturas_funcionais`

private class ListStack[T] private (val elements: List[T], override val size: Int) extends Stack[T] {
    private def this() = this(Nil, 0)
    private def this(elements: List[T]) = this(elements, elements.size)
    (...)