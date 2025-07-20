package `05-estruturas_funcionais`

//Tentativa de composição insegura de funções
@main def testUnsafeComposition(): Unit = {
    val result = divide(10, 2) + multiply(3, 4)
}