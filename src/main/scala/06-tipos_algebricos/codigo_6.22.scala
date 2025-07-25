package `06-tipos_algebricos`

//Máquina de estados finitos (FSM) usando tipos soma e casamento de padrões
sealed trait TrafficLight
case object Red extends TrafficLight
case object Green extends TrafficLight
case object Yellow extends TrafficLight

def nextLight(light: TrafficLight): TrafficLight = light match {
    case Red => Green
    case Green => Yellow
    case Yellow => Red
}

@main def runTrafficLights(): Unit = {
    val lights: List[TrafficLight] = List(Red, Green, Yellow)

    lights.foreach { light =>
        println(s"Luz atual: $light, Próxima luz: ${nextLight(light)}")
    }
}