package `05-estruturas_funcionais`

//Implementação das classes Nil e Cons.

package scala.collection.immutable

sealed abstract class List[+A] extends Iterable[A] {
    val head: A
    val tail: List[A]

// Outros métodos e definições...
}

final case class ::[+A](override val head: A, override val tail: List[A]) 
    extends List[A] {
override def isEmpty: Boolean = false
// Outros métodos e definições...
}

final case object Nil extends List[Nothing] { 
    override def head: Nothing = throw new NoSuchElementException("head of empty list")
override def tail: List[Nothing] = throw new NoSuchElementException("tail of empty list")
// Outros métodos e definições...
}