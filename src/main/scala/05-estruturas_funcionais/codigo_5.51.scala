package `05-estruturas_funcionais`

//Implementação de uma fila funcional com duas pilhas

class TwoStacksQueue[T] (val front: List[T] = List.empty, val rear: List[T] = List.empty, override val size: Int) extends Queue[T] {

    def enqueue(element: T): TwoStacksQueue[T] = new TwoStacksQueue(front, element :: rear, size + 1)

    def dequeue: (Option[T], TwoStacksQueue[T]) =
        if (front.isEmpty && rear.isEmpty) (None, this)
        else if (front.isEmpty) {
    val newFront = rear.reverse
    (Some(newFront.head), new TwoStacksQueue(newFront.tail, List.empty, size - 1))
        } else {
            (Some(front.head), new TwoStacksQueue(front.tail, rear, size - 1))
        }

(...)

    override def toString: String = s"front -> (${front.mkString(", ")}) (${rear.reverse.mkString(", ")}) <- rear"
}