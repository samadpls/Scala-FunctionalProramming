package assingment2
import scala.util.Random
import scala.math
object ex3 {
  def square(vec:Vector[Int])={
    vec.map(x=>x*x)
  }
  def sum(vec:Vector[Int])={
    vec.sum
  }
  def euclidean(vec:Vector[Int])={
    sum(square(vec))
  }

  def main(args:Array[String])={
    val vec=Vector.fill(10)(Random.nextInt(100))
    println(vec)
    val ans=euclidean(vec)
    print(ans)
  }

}
