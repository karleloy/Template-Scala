package `05-estruturas_funcionais`

//Enfileiramento e desenfileiramento com duas pilhas

val queue = new TwoStacksQueue[Int]()
queue.enqueue(1).enqueue(2).enqueue(3)
val (deq1, queue1) = queue.dequeue