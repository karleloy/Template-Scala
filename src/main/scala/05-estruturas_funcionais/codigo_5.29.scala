//Definição de uma classe PositivePair com construtor privado

class PositivePair2 private (override val first: Int, override val second:
    Int) extends Pair[Int](first, second) {
    (...)

    override def name = "PositivePair"
}