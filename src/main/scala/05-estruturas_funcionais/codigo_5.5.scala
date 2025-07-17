package ListSum

def listSum(xs: List[Int]): Int = {
    if (xs.isEmpty) 0
    else xs.head + listSum(xs.tail)
}

@main def testListSum(): Unit = {
    println(listSum(List(1, 2, 3)))
    println(listSum(List(4, 5, 6)))
    println(listSum(Nil))
    println(listSum(List(10)))
}