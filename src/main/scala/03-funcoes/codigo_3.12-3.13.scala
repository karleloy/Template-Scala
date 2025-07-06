trait Function2[A, B, R] {
    def apply(a: A, b: B): R
}

//Funções anônimas como objetos
def getTraits() = {
    val identity: Int => Int = x => x
    val add: (Int, Int) => Int = (x, y) => x + y
    val multiply: (Int, Int) => Int = (x, y) => x * y

    identity.getClass.getInterfaces.foreach { i =>
        println(s"Identity interfaces: ${i.getName}")
    }
    add.getClass.getInterfaces.foreach { i =>
        println(s"Add interfaces: ${i.getName}")
    }
    multiply.getClass.getInterfaces.foreach { i =>
        println(s"Multiply interfaces: ${i.getName}")
    }
}

@main def run2(): Unit = {
    getTraits()
}