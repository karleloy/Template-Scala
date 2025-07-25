package `06-tipos_algebricos`

//Exemplos (simplificados) de tipos soma na biblioteca‐padrão Scala
sealed trait Option[T]
case class Some[T](value: T) extends Option[T]
case object None extends Option[Nothing]

sealed trait Either[A, B]
case class Left[A](value: A) extends Either[A, Nothing]
case class Right[B](value: B) extends Either[Nothing, B]

sealed abstract class Try[T]
case class Success[T](value: T) extends Try[T]
case class Failure[T](exception: Throwable) extends Try[T]