//Tratamento de erros com exceções

def divide(x: Int, y: Int): Int = {
    if (y == 0) throw new ArithmeticException("Division by zero")
    x / y
}

@main def testDivide(): Unit = {
    try {
    println(divide(10, 2)) 
    println(divide(10, 0)) 
    } catch {
        case e: ArithmeticException => println(e.getMessage) 
    }
}