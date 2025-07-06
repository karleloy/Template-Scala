//Método List.map
val numbers = List(1, 2, 3, 4, 5)

val doubled = numbers.map(n => n * 2)
val squared = numbers.map(n => n * n)
 
@main def run3(): Unit = {
    println(s"Números originais: $numbers")
    println(s"Números dobrados: $doubled")
    println(s"Números ao quadrado: $squared")
}