package `06-tipos_algebricos`

//Cálculo da soma dos elementos de uma lista usando casamento de padrões
sealed trait List[+A]
case object Nil extends List[Nothing]
case class Cons[+A](head: A, tail: List[A]) extends List[A]

def sum(list: List[Int]): Int = list match {
    case Nil => 0
    case Cons(head, tail) => head + sum(tail)
}

@main def runListSum(): Unit = {
    val numbers: List[Int] = Cons(1, Cons(2, Cons(3, Nil)))
    println(s"Soma: ${sum(numbers)}")
}