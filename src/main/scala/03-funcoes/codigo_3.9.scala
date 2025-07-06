@main def parâmetrosVariádicos(): Unit =
    def doubleAll(numbers: Int*): Seq[Int] =
        numbers.map(n => n * 2)
    
    println(s"Números dobrados: ${doubleAll(1, 2, 3, 4, 5)}")