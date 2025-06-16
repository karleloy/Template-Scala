def buildList(n: Int): List[Int] =
    if (n <= 0) List() // Caso base: lista vazia
    else n :: buildList(n - 1) // Caso recursivo: adiciona n no início da lista 

@ main def main(): Unit = 
    val list = buildList(10)
    println(s"List from 1 to 10: $list")