package `05-estruturas_funcionais`

//Definição de tipos de erro

sealed trait ArithmeticError
case object DivisionByZero extends ArithmeticError
case class NegativeNumberError(value: Int) extends ArithmeticError
case class OverflowError(value: Int) extends ArithmeticError