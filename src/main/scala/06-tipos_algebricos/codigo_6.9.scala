package `06-tipos_algebricos`

//Definição de um tipo produto que contém um tipo soma como componente

case class OperationResult[T](result: Option[T], timestamp: Long)