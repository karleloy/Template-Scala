package `05-estruturas_funcionais`

//Composição segura de funções com Option via padrão de flatMaps a map aninhados
def expression4(x: Int, y: Int, z: Int): Option[Int] = {
    divide(x, y).flatMap { quotient1 =>
        divide(x, z).map { quotient2 =>
            quotient1 + quotient2
        }
    }
}

@main def testExpression4(): Unit = {
    println(expression4(10, 2, 3)) // Some(8)
    println(expression4(10, 2, 0)) // None
}
