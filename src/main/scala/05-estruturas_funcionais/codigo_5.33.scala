package `05-estruturas_funcionais`

//Tratamento de erros com tipos de resultado
def divide(x: Int, y: Int): Either[String, Int] = {
    if (y == 0) Left("Division by zero")
    else Right(x / y)
}
@main def testDivideEither(): Unit = {
    println(divide(10, 2)) // Right(5)
    println(divide(10, 0)) // Left(Division by zero)
}