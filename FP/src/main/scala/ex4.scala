import  Array._
object ex4 {
 //higher order fucntion which can take function into its parameter
  //array has many HOF some of them are
  def main(args: Array[String])={

  val arry1= Array("A","B","C")
  val arry2=Array("5","6","7")
  var arry3= concat(arry1,arry2)
  for (i<- arry3){
    println(" "+i)
  }
  }
}
