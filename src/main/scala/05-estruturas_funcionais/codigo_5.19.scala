//Definição de uma classe imutável para representar um par ordenado de inteiros positivos
class Pair1[T](val first: T, val second: T) {

    def copy(first: T = this.first, second: T = this.second): Pair1[T] = {
        new Pair1(first, second)
}

    def name = "Pair"

    override def toString: String = s"${name}($first, $second)"
}

class PositivePair(override val first: Int, override val second: Int) extends Pair1[Int](first, second) {
    require(first > 0 && second > 0, "Both elements must be positive integers")

    override def name = "PositivePair"
}

@main def testPositivePair(): Unit = {
    val pair = new PositivePair(1, 2)
    println(pair) // PositivePair(1, 2)
    val modifiedPair = pair.copy(first = 3)
    println(modifiedPair) // PositivePair(3, 2)
    println(pair.first) // 1
    println(pair.second) // 2
    // O seguinte código lançará uma exceção, pois os elementos não são positivos
    val invalidPair = new PositivePair(-1, 2) // Lança IllegalArgumentException
}