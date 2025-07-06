@main def expVarImutavel(): Unit = 
    val x = 10

    x = 10 //Compilation error
    println(x)