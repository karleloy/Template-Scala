package `05-estruturas_funcionais`

//Enfileiramento de uma fila funcional

val queue = new NaiveListQueue[Int]()
val queue1 = queue.enqueue(1)
val queue2 = queue1.enqueue(2)
val queue3 = queue2.enqueue(3)
val queue4 = queue3.enqueue(4)