import vertezml.{Mean}

object Main extends App{
    val numbers = List(1.0,2.0,3.0,4.0,5.0)
    val meanVal = Mean.mean(numbers)
    println(s"Mean Value: $meanVal")
}
