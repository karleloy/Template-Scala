//Parâmetros nomeados
@main def parâmetrosNomeados(): Unit =
    def fullName(first: String = "Fulano", last: String): String =
        s"$first $last"

    println(s"Nome completo: ${fullName(first = "João", last = "Silva")}")
    println(s"Nome completo: ${fullName(last = "Silva", first = "João")}")
    println(s"Nome completo: ${fullName(last = "Silva")}")