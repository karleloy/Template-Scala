@main def criaçãoListas(): Unit = 
    val emptyList = List() //lista vazia
    val numbers = List(1, 2, 3, 4, 5) //lisa de inteiros
    val names = List("Alice", "Bob", "Charlie") //lista de strings
    val mixed = List(1, "Two", 3.0) //lista mista (heterogenea)
    println(s"$emptyList")
    println(s"$numbers")
    println(s"$names")
    println(s"$mixed")

    val emptyList1 = List() // Lista vazia
    val emptyList2 = Nil // Outra forma de representar a lista vazia
    println(s"Empty list 1: $emptyList1")
    println(s"Empty list 2: $emptyList2")