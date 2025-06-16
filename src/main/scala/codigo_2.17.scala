@main def operadorCons(): Unit = 
    val numbers = List(2, 3, 4)
    val newList = 1 :: numbers //add 1 ao inicio da lista numbers
    println(newList) // Imprime: List(1, 2, 3, 4)

    val anotherList = 0 :: 1 :: numbers // add 0 e 1 no início da lista numbers
    println(anotherList) // Imprime: List(0, 1, 2, 3, 4)

    println(numbers) //preserva imutabilidade da lista original