//Função List.filter
val numbers1 = List(1, 2, 3, 4, 5)
val evenNumbers = numbers1.filter(n => n % 2 == 0)
val oddNumbers = numbers1.filter(n => n % 2 != 0)
val greaterThanFive = numbers1.filter(n => n > 5)

@main def run4(): Unit = {
    println(s"Números originais: $numbers1")
    println(s"Números pares: $evenNumbers")
    println(s"Números ímpares: $oddNumbers")
    println(s"Números maiores que cinco: $greaterThanFive")
}