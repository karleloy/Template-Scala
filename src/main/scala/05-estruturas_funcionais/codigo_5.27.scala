package `05-estruturas_funcionais`

//Composição segura de funções com Option
def testSafeComposition(x: Int, y: Int, z: Int): Int = {
    multiply(x, y) + divide(x, z).getOrElse(0)
}
@main def main(): Unit = {
    val safeResult = testSafeComposition(10, 2, 2)
    println(s"Safe composition result: $safeResult")

    val safeResult2 = testSafeComposition(10, 2, 0)
    println(s"Safe composition with division by zero: $safeResult2")
}