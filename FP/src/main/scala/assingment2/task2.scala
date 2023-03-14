package assingment2

object task2 {

  //11.13 is not giving so i am using the random example
  case class Basket(var item:String)
  def main(args: Array[String])= {
    val b1 = Basket("Apple")
    var b2 = b1.copy()
    b1.item="Orange"
    println(b2) //by default case class Copy method uses
//     shallow copy means change made in one object
//    doesnt effect the copied object


  }

}
