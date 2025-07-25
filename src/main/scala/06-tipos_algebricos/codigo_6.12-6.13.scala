package `06-tipos_algebricos`

//Definição de uma lista como um tipo soma
sealed trait MyList[A]
case object Nil extends MyList[Nothing]
case class Cons[A](head: A, tail: MyList[A]) extends MyList[A]

//Exemplo de uso da lista definida como tipo soma
val list: MyList[Int] = Cons(1, Cons(2, Cons(3, Nil)))
println(list) // Exibe a lista