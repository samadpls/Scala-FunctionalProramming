import scala.annotation.tailrec

object task3 {
  def summingArray(a1: Array[Double], a2: Array[Double]): Array[Double] = {
    var a3 = new Array[Double](a1.length)

    @tailrec def sum(v1: Double, v2: Double, idx: Int): Array[Double] = {
      if (idx == a1.length - 1) {
        a3(idx) = v1 + v2
        a3
      } else {
        a3(idx) = v1 + v2
        sum(a1(idx + 1), a2(idx + 1), idx + 1)
      }
    }

    sum(a1.head, a2.head, 0)
  }

  def main(args: Array[String]) = {
    val a1 = Array(1.0,2.0,3.0)
    val a2 = Array(4.0,5.0,6.0)
    println(summingArray(a1, a2).mkString(","))
  }
}
