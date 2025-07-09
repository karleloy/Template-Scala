// Exemplo de uso de mapa mutável em Scala.
// Testar no REPL (scala no prompt)
import scala.collection.mutable

val cache: mutable.Map[String, Int] = mutable.Map()

// Adicionando valores ao mapa
cache("um") = 1
cache("dois") = 2

// Acessando valores do mapa
println(cache("um")) // Output: 1
println(cache("dois")) // Output: 2
// Verificando se uma chave existe no mapa
println(cache.contains("três")) // Output: false
// Testando e se não existe, adicionando um valor
println(cache.getOrElseUpdate("três", 3)) 
println(cache.getOrElseUpdate("três", 4)) 