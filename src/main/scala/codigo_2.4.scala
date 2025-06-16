def  sayName = "Karl Eloy"

def getAge(yearOfBirth: Int) = 
    java.time.Year.now.getValue - yearOfBirth

@main def expEstruturaFuncional() = 
    println("Name: " + sayName)
    println("Age: " + getAge(1986))