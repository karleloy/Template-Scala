//Definição de uma classe imutável para representar um par ordenado

class Pair[T](val first: T, val second: T) {

    def copy(first: T = this.first, second: T = this.second): Pair[T] = {
        new Pair(first, second)
}

    def name = "Pair"

    override def toString: String = s"${name}($first, $second)"
}

@main def testPair(): Unit = {
    val pair = new Pair(1, 2)
    println(pair) 

    val modifiedPair = pair.copy(first = 3)
    println(modifiedPair) 

    println(pair.first) 
    println(pair.second)
    }