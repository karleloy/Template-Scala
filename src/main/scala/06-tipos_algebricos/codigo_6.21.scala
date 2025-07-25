package `06-tipos_algebricos`

sealed trait Result[T]
case class Success[T](value: T) extends Result[T]
case class Failure[T](error: String) extends Result[T]
case class Pending[T](message: String) extends Result[T]

//Adicionando uma nova variante ao tipo soma Result[T]

def handleResult[T](result: Result[T]): String = result match {
    case Success(value) => s"Operação bem-sucedida: $value"
    case Failure(error) => s"Operação falhou: $error"
    case Pending(message) => s"Operação pendente: $message"
}

@main def runResultExample(): Unit = {
    val successResult: Result[Int] = Success(42)
    val failureResult: Result[Int] = Failure("Erro desconhecido")
    val pendingResult: Result[Int] = Pending("Aguardando confirmação")

    println(handleResult(successResult))
    println(handleResult(failureResult))
    println(handleResult(pendingResult))
}