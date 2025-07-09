def imperativeSum(a: Int, b: Int): Int = {
    if (a > b) {
        return 0
    }

    var sum = 0
    var i = a

    while (i <= b) {
        sum += i
        i += 1
    }

    return sum
}

@main def hello(): Unit = 
    println(imperativeSum(1, 10)) 
    println(imperativeSum(5, 15)) 
    println(imperativeSum(0, 100))