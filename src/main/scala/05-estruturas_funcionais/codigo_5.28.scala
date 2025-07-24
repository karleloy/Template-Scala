package `05-estruturas_funcionais`

def expression5(x: Int, y: Int, z: Int): Option[Int] = {
    for {
        quotient1 <- divide(x, y)
        quotient2 <- divide(x, z)
    } yield quotient1 + quotient2
}

@main def testExpression5(): Unit = {
    println(expression5(10, 2, 3)) // Some(8)
    println(expression5(10, 2, 0)) // None
}