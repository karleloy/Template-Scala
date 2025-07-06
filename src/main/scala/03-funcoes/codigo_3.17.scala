//Passo a passo do processo de redução
val numbers3 = List(1, 2, 3, 4, 5)
val sum2 = numbers3.reduce((a, b) => {
    println(s"Acumulador: $a, Elemento atual: $b")
    a + b
})

@main def run6(): Unit = {
    println(s"Números originais: $numbers3")
    println(s"Soma: $sum2")
}