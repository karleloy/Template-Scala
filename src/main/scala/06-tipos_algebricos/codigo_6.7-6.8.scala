package `06-tipos_algebricos`

//Definição de um tipo soma usando sealed trait e case classes

sealed trait Result[T]
case class Success[T](value: T) extends Result[T]
case class Failure[T](error: String) extends Result[T]

def divide(a: Int, b: Int): Result[Int] = {
    if (b == 0) Failure("Division by zero")
    else Success(a / b)
}

@main def testResult = {
    println(divide(10, 2))
    println(divide(10, 0))
}