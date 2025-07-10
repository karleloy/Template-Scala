package ex_funcoes

//1
def oddDoubled(data: List[Int]): List[Int] =
data.filter(x => x % 2 != 0).map(x => x * 2)

//2
def filterBySize(strings: List[String], minSize: Int, maxSize: Int):
    List[String] = {
  strings.filter(s => s.length >= minSize && s.length <= maxSize)
}

//3
def sumOfSquaresOfEvens(data: List[Int]): Int = {
    val evens = data.filter(x => x % 2 == 0)
    if (evens.isEmpty) 0
    else evens.map(x => x * x).reduce((x, y) => x + y)
}

//4
def averageApproved(students: List[(String, Double)]): Double = {
    val approvedStudents = students.filter(student => student._2 >= 7.0)
    if (approvedStudents.isEmpty) 0.0
    else {
        val approvedGrades = approvedStudents.map(student => student._2)
        val total = approvedGrades.reduce((a, b) => a + b)
        val count = approvedStudents.length
        total / count
    }
}

//5
def avgTemperatures(temps: List[(Int, Double)], timestamp: Int): Double = {
    val filtered = temps.filter(x => x._2 >= 0.0 && x._1 <= timestamp)
    if (filtered.isEmpty) 0.0
    else filtered.map(x => x._2).reduce((x, y) => x + y) / filtered.length
}

//6
def avgLengthOfStrings(strings: List[String], minLength: Int): Double = {
    val filtered = strings.filter(s => s.length >= minLength)
    if (filtered.isEmpty) 0.0
    else filtered.map(s => s.length).reduce((x, y) => x + y).toDouble / filtered.length
}

//7
def calculateFinalPrice(cart: List[(Int, Double, Double)]): Double = {
    def discount(peso: Double): Double =
        if (peso <= 0.5) 0.05
        else if (peso <= 1.0) 0.10
        else if (peso <= 2.0) 0.15
        else 0.20

    def frete(peso: Double): Double =
        if (peso <= 0.5) 1.0
        else if (peso <= 1.0) 1.5
        else if (peso <= 2.0) 2.0
        else 3.0

    val totalDescontado = cart.map(item => item._2 * (1 - discount(item._3))).reduce((a, b) => a + b)

    val totalFrete = cart.map(item => frete(item._3)).reduce((a, b) => a + b)

    totalDescontado + totalFrete
}