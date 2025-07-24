package `05-estruturas_funcionais`

//Tentativa de composição insegura de funções

def expression1(x: Int, y: Int, z: Int): Option[Int] = {
    divide(x, y) + divide(x, z)
}