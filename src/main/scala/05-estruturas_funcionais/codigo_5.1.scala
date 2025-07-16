package `05-estruturas_funcionais`
//Exemplos de criação e manipulação de listas

// Creating lists with elements
val numbers = List(1, 2, 3, 4, 5)
val fruits = List("apple", "banana", "orange")
val booleans = List(true, false, true)

// Creating empty lists
val emptyList1: List[Int] = List()
val emptyList2: List[String] = Nil
val emptyList3 = List.empty[Double]

// Extracting head and tail
val firstNumber = numbers.head // 1
val remainingNumbers = numbers.tail // List(2, 3, 4, 5)

// Checking list length
val numbersLength = numbers.length // 5
val fruitsLength = fruits.size // 3 (size is equivalent to length)
val emptyLength = emptyList1.length // 0

// Adding elements to the beginning using cons (::) -- prepend
val originalList = List(2, 3, 4)

// Prepending single elements
val withOne = 1 :: originalList //List(1, 2, 3, 4)
val withZero = 0 :: withOne //List(0, 1, 2, 3, 4)

// Prepending multiple elements
val withNegatives = -2 :: -1 :: withZero
println(s"After prepending -2 and -1: $withNegatives") //List(-2, -1, 0, 1, 2, 3, 4)

// Building a list from scratch using cons
val builtFromScratch = 1 :: 2 :: 3 :: Nil ////List(1, 2, 3)

// Adding elements to the end using append (:+)
val appendedList = originalList :+ 5 // List(2, 3, 4, 5)

// Concatenating two lists
val listA = List(1, 2, 3)
val listB = List(4, 5, 6)
val concatenatedList = listA ::: listB // List(1, 2, 3, 4, 5, 6)
val concatenatedList2 = listA ++ listB // List(1, 2, 3, 4, 5, 6)