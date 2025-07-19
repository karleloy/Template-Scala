//Tratamento de erros com tipos opcionais

def divide_(x: Int, y: Int): Option[Int] = {
    if (y == 0) None
    else Some(x / y)
}
@main def testDivideOption(): Unit = {
println(divide_(10, 2)) 
println(divide_(10, 0)) 
}

//Definição de uma função de multiplicação
def multiply_(x: Int, y: Int): Int = x * y

//Tentativa de composição insegura de funções
@main def testUnsafeComposition(): Unit = {
    val result = divide(10, 2) + multiply(3, 4)
}

//Composição segura de funções com Option
def testSafeComposition(x: Int, y: Int, z: Int): Int = {
    multiply_(x, y) + divide_(x, z).getOrElse(0)
}
@main def main_(): Unit = {
    val safeResult = testSafeComposition(10, 2, 2)
    println(s"Safe composition result: $safeResult")

    val safeResult2 = testSafeComposition(10, 2, 0)
    println(s"Safe composition with division by zero: $safeResult2")
}