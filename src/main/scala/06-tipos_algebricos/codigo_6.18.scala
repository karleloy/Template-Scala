package `06-tipos_algebricos`

//Casamento de padrões aninhado em tipos produto
case class Address(street: String, city: String)

case class Customer(name: String, address: Address)

def customerInfo(customer: Customer): String = customer match {
    case Customer(name, Address(street, city)) =>
        s"Nome: $name\nEndereço: $street, $city"
}

@main def runCustomerExample(): Unit = {
    val customer = Customer("Alice", Address("123 Main St", "Wonderland"))
    println(customerInfo(customer))
}