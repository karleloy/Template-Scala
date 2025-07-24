package `05-estruturas_funcionais`

//Tratamento de erros com tipos opcionais
def divide(x: Int, y: Int): Option[Int] = {
    if (y == 0) None
    else Some(x / y)
}

@main def testDivideOption(): Unit = {
println(divide(10, 2)) 
println(divide(10, 0)) 
}