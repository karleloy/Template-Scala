package `06-tipos_algebricos`

//Uso de padrões de guarda em casamento de padrões
case class Item(name: String, price: Double)

sealed trait ItemCategory
case class Cheap(item: Item) extends ItemCategory
case class ModeratelyPriced(item: Item) extends ItemCategory
case class Expensive(item: Item) extends ItemCategory
case class Unknown(item: Item) extends ItemCategory

def categorizeItem(item: Item): ItemCategory = {
    item match {
        case Item(n, p) if p < 10.0 => Cheap(item)
        case Item(n, p) if p >= 10.0 && p <= 100.0 => ModeratelyPriced(item)
        case Item(n, p) if p > 100.0 => Expensive(item)
        case _ => Unknown(item)
    }
}