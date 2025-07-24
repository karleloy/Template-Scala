package `05-estruturas_funcionais`

//Implementação da operação de empilhamento
override def push(x: T): Stack[T] = {
    new ListStack(x :: elements, size + 1)
}