// Exemplo de uso de ArraySeq
import scala.collection.immutable.ArraySeq

@main def expUsoArraySeq(): Unit =
    val numbers = ArraySeq(1, 2, 3, 4, 5)
    println(numbers) // ArraySeq(1, 2, 3, 4, 5)
    val updatedNumbers = numbers.updated(2, 10)
    println(updatedNumbers) // ArraySeq(1, 2, 10, 4, 5)
    println(numbers) // ArraySeq(1, 2, 3, 4, 5)