package `05-estruturas_funcionais`

//Implementação da operação de desempilhamento

override def pop: (Option[T], Stack[T]) = {
    if (elements.isEmpty) (None, this)
    else (Some(elements.head), new ListStack(elements.tail, size - 1))
}