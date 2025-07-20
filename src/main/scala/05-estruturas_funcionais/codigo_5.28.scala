package `05-estruturas_funcionais`

def safeArithmetic(x: Int, y: Int, z: Int): Option[Int] = {
    divide(x, z).map(_ + multiply(x, y))
}

@main def main_(): Unit = {
    val safeArithResult = safeArithmetic(10, 2, 3)
    println(s"Safe arithmetic result: $safeArithResult")
    val safeArithResult2 = safeArithmetic(10, 2, 0)
    println(s"Safe arithmetic with division by zero: $safeArithResult2")
}