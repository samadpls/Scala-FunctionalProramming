import scala.annotation.tailrec
object task2 {
  def CharArray ( start : Int ) : List [ Char ]={
    @tailrec
    def recursion(n:Int,lst:List[Char]=Nil):List[Char]= {
      if (n==123) {
        lst
      }
      else {
        recursion(n + 1, lst:+n.toChar)
      }
    }
    recursion(start)
    }

  def main(args : Array[String])={
    println(CharArray(97).mkString(","))
  }
}
