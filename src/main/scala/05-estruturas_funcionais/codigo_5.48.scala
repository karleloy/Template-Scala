package `05-estruturas_funcionais`

//Desenfileiramento de uma fila funcional

val queue = new NaiveListQueue[Int]()
val queue1 = queue.enqueue(1).enqueue(2).enqueue(3).enqueue(4)

val (deq1, queue2) = queue1.dequeue
val (deq2, queue3) = queue2.dequeue
val (deq3, queue4) = queue3.dequeue