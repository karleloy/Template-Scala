def  sayName = "Karl Eloy"

def getAge(yearOfBirth: Int) = 
    java.time.Year.now.getValue - yearOfBirth

@main def main() = 
    println("Name: " + sayName)
    println("Age: " + getAge(1986))