package assingment2

object ModuleA {
  def process(input: String): String = {
    // processing logic here
    input.toUpperCase
  }
}

object ModuleB {
  def process(input: String): String = {
    // processing logic here
    input.toLowerCase
  }
}

object MyApp {
  def myFunction(input: String, moduleA: ModuleA.type, moduleB: ModuleB.type): (String, String) = {
    val outputA = moduleA.process(input)
    val outputB = moduleB.process(input)
    (outputA, outputB)
  }
}
object MyMain {
  // usage example
  def main(args: Array[String]): Unit = {
    val input = "Hello, World!"
    val (outputA, outputB) = MyApp.myFunction(input, ModuleA, ModuleB)
    println(s"Output A: $outputA")
    println(s"Output B: $outputB")
  }
}