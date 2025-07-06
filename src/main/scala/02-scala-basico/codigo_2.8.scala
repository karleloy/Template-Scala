@main def expTiposInferidos(): Unit =  
    val x = 10
    val y = "Hello, World!"
    val z = true
    val pi = 3.14
    val list = List(1, 2, 3, 4, 5)
    val map = Map("one" -> 1, "two" -> 2, "three" -> 3)

    List(x, y, z, pi, list, map).foreach(item => println(s"${item.getClass.getSimpleName}: $item"))