package `05-estruturas_funcionais`

//Implementação das operações de consulta da pilha

override def isEmpty: Boolean = elements.isEmpty
override def toString: String = s"top -> (${elements.mkString(", ")})"