//Uma função é recursiva na cauda quando todas
//as chamadas recursivas são chamadas na cauda.

//Exemplos de funções recursivas na cauda.
package recursaoCauda

// Not tail recursive
def a(n: Int): Int =
    if (n <= 1) n
    else a(n - 1) + a(n - 2)

// Tail recursive
def b(n: Int, x: Int = 0, y: Int = 1): Int =
    if (n == 0) x
    else b(n - 1, y, x + y)

// Not tail recursive
def c(x: Int, n: Int): Int =
    if (n == 0) 1
    else x * c(x, n - 1)

// Tail recursive
def d(x: Int, n: Int, acc: Int = 1): Int =
    if (n == 0) acc
    else d(x, n - 1, acc * x)

// Modified: two tail recursive cases
def e(n: Int, acc: Int = 0): Int =
    if (n == 0) acc
    else if (n % 2 == 0) e(n / 2, acc + n)
    else e(n - 1, acc + 1)

// f: two recursive cases, one tail recursive, one not
def f(n: Int, acc: Int = 0): Int =
    if (n <= 0) acc
    else if (n % 2 == 0) f(n - 1, acc + n) // tail recursive
    else n + f(n - 2, acc) // not tail recursive