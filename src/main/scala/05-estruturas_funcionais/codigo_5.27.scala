//Composição segura de funções com Option

def divide3(x: Int, y: Int): Option[Int] = {
    if (y == 0) None
    else Some(x / y)
}

def multiply3(x: Int, y: Int): Int = x * y

def safeArithmetic(x: Int, y: Int, z: Int): Option[Int] = {
    divide3(x, z).map(_ + multiply3(x, y))
}

@main def main3(): Unit = {
    val safeArithResult = safeArithmetic(10, 2, 3)
    println(s"Safe arithmetic result: $safeArithResult")
    val safeArithResult2 = safeArithmetic(10, 2, 0)
    println(s"Safe arithmetic with division by zero: $safeArithResult2")
}