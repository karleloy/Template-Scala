package `05-estruturas_funcionais`

//Implementação da operação de consulta ao topo
override def peek: Option[T] = {
    if (elements.isEmpty) None
    else Some(elements.head)
}
