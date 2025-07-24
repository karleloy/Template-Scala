package `05-estruturas_funcionais`

// Implementação de uma fila funcional com listas

class NaiveListQueue[T](elements: List[T] = List.empty) extends Queue[T] { 
    def enqueue(element: T): Queue[T] = new NaiveListQueue(elements :+ element)

    def dequeue: (Option[T], Queue[T]) =
        if (elements.isEmpty) (None, this)
        else (Some(elements.head), new NaiveListQueue(elements.tail))

    def peek: Option[T] = elements.headOption

    def isEmpty: Boolean = elements.isEmpty

    def size: Int = elements.size

    override def toString: String = s"front -> (${elements.mkString(", ")})"
}