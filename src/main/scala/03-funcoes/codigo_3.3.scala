//Funções aninhadas
def f1(a: Int, b: Int): Int =
    def f2(c: Int): Int =
        a + b + c
    f2(a - b)

@main def testF1(): Unit =
    val a = 5
    val b = 3
    println(s"O resultado de f1($a, $b) é: ${f1(a, b)}")    