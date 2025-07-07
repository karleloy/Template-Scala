def f(x: Int) = {
    val y = 2
    (z: Int) => x + y + z
}

@main def run10() = {
    val c = f(3)
    val result = c(4) // This will compute 3 + 2 + 4
    println(s"Result of the closure: $result") // Should print 9
}