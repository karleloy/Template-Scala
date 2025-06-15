@main def expressaoCondicional(): Unit = 
    val x = 10
    val y = 20

    val max = if (x > y) x else y
    println(s"Max of $x and $y is: $max")

    val isEven = if (x % 2 == 0) "even" else "odd"
    println(s"$x is $isEven")

    //exemplo de expressoes com blocos sem efeitos colaterais
    val totalItems = 12

    val price = if (totalItems > 10)
        val pricePerItem = 100
        val tax = 0.1

        totalItems * pricePerItem * (1 + tax)
    
    else
        val pricePerItem = 150
        val comission = 0.2

        totalItems * pricePerItem * (1 + comission)
    
    println(s"Total price for $totalItems items is: $price")