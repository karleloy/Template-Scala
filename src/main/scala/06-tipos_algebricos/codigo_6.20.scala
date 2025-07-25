package `06-tipos_algebricos`

sealed trait Result[T]
case class Success[T](value: T) extends Result[T]
case class Failure[T](error: String) extends Result[T]

//Casamento de padrões com tipos soma
def handleResult[T](result: Result[T]): String = result match {
    case Success(value) => s"Operação bem-sucedida: $value"
    case Failure(error) => s"Operação falhou: $error"
}

@main def runResultExample(): Unit = {
    val successResult: Result[Int] = Success(42)
    val failureResult: Result[Int] = Failure("Erro desconhecido")

    println(handleResult(successResult))
    println(handleResult(failureResult))
}