package `06-tipos_algebricos`

//Exemplo de uso do tipo Try
import scala.util.{Try, Success, Failure}

def divide(a: Int, b: Int): Try[Int] = Try {
    a / b
}

@main def run = {
    println(divide(10, 2))
    println(divide(10, 0))
    println(divide(10, -2))
}