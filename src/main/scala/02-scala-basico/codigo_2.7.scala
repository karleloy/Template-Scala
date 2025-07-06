@main def expTiposExplicitos(): Unit =   
    val x: Int = 10
    val y: String = "Hello, World!"
    val z: Boolean = true
    val pi: Double = 3.14
    val list: List[Int] = List(1, 2, 3, 4, 5)
    val map: Map[String, Int] = Map("one" -> 1, "two" -> 2, "three" -> 3)

    List(x, y, z, pi, list, map).foreach(item => println(s"${item.getClass.getSimpleName}: $item"))