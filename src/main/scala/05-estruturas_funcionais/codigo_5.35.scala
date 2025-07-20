package `05-estruturas_funcionais`

//Tratamento de erros com tipos de resultado e tipos de erro
def dividePositive(x: Int, y: Int): Either[ArithmeticError, Int] = {
    if (y == 0) Left(DivisionByZero)
    else if (x < 0 || y < 0) Left(NegativeNumberError(x))
    else if (x > Int.MaxValue / y) Left(OverflowError(x))
    else Right(x / y)
}

@main def testDivideEitherWithErrors(): Unit = {
    println(dividePositive(10, 2))
    println(dividePositive(10, 0))
    println(dividePositive(-10, 2))
    println(dividePositive(Int.MaxValue, 2))
}