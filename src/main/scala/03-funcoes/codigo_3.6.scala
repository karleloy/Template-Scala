//Parâmetros imutáveis por padrão
def increment(x: Int): Int = {
    x = x + 1 // Isso causará um erro de compilação
    x
}