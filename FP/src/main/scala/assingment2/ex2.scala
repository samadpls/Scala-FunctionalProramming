package assingment2
import scala.math
object ex2 {
  def y(x:Int,a:Int=3,b:Int=5,c:Int=7):Double={
    (a*math.pow(x,2))+(b*x)+c
  }
  def main(args:Array[String])= {
    val xList = Range(-3, 3).toList
    val yList=xList.map(y(_))
    val zipping = (xList zip yList).zipWithIndex
    println(zipping)
    val mean = (yList.sum)/yList.length
    print(mean)
  }

}
