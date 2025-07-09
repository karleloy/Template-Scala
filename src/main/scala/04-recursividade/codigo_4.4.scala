package chamadaCauda

// no tail call
def f(x: Int, y: Int): Int = {
    x + y
}

// tail call
def g(x: Int): Int = {
    val y = 10

    f(x, y)
}

// no tail call
def h(y: Int): Int = {
    val x = 5

    f(x, y) + x
}

// tail call
def m(z: Int): Int = {
    f(z, h(z + 1))
}

// mixed: tail call and no tail call
def p(x: Int): Int = {
    if (x <= 0) f(x, 0)
    else x + f(x - 1, 0)
}