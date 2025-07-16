def listSizeTailRec(xs: List[Any], acc: Int = 0): Int = {
    if (xs.isEmpty) acc
    else listSizeTailRec(xs.tail, acc + 1)
}

@main def testListSizeTailRec(): Unit = {
    println(listSizeTailRec(Nil))
    println(listSizeTailRec(List(1, 2, 3)))
    println(listSizeTailRec(List("a", "b")))
    println(listSizeTailRec(List()))
}
