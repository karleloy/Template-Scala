package `05-estruturas_funcionais`

//Definição de um companion object para PositivePair

object PositivePair2 {
    def apply(first: Int, second: Int): Option[PositivePair2] = {
        if (first >= 0 && second >= 0) {
        Some(new PositivePair2(first, second))
        } else {
            None
        }
    }
}