package `05-estruturas_funcionais`

//Composição segura de funções com Option via métodos extratores
def expression2(x: Int, y: Int, z: Int): Int = {
    divide(x, y).getOrElse(0) + divide(x, z).getOrElse(0)
}

@main def main(): Unit = {
    println(expression2(10, 2, 3))
    println(expression2(10, 2, 0))
}