//Operações básicas com ArraySeq
import scala.collection.immutable.ArraySeq

@main def expOpArraySeq(): Unit =
    val numbers = ArraySeq(1, 2, 3, 4, 5)
    println(numbers(0)) // Acessa o primeiro elemento: 1
    println(numbers(2)) // Acessa o terceiro elemento: 3
    println(numbers.length) // Tamanho da ArraySeq: 5
    println(numbers.isEmpty) // Verifica se a ArraySeq está vazia: false//Operações básicas com ArraySeq
    println(numbers.contains(3)) // Verifica se o elemento 3 está presente: true
    println(numbers.indexOf(4)) // Encontra o índice do elemento 4: 3
    println(numbers.lastIndexOf(2)) // Encontra o último índice do elemento 2: 1