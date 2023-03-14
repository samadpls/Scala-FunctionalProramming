package assingment2
import scala.util.{Try, Success, Failure}

object task3 {
  def L11_2(uList:Seq[Int])={

    val uList_Twice = uList.map(_ * 2)
    println(s"List element doubled- $uList_Twice")
    def f(x:Int)= if (x>2) x*x else None
    val uList_Squared = uList.map(f(_))
    println(s"List elements squared selectively - $uList_Squared")
  }
  def L11_3(uList:Vector[Int])={
    def g(v:Int)=Vector(v-1,v,v+1)
    val uList_Extended = uList.map(g(_))
    println(s"Extended list using map -$uList_Extended")
    val uList_Extended_flatmap =uList.flatMap(g(_))
    println(s"Extended list using flatMap -$uList_Extended_flatmap")

  }

  def L11_4(uList: Set[Int]) = {

    val uList_Twice = uList.map(_ * 2)
    println(s"List element doubled- $uList_Twice")

    def f(x: Int) = if (x > 2) Some(x) else None

    val uList_selective = uList.map(f(_))
    println(s"Selective element of List  with .map - $uList_selective")

    val uList_selective_flatmap= uList.flatMap(f(_))
    println(s"Selective element of List  with .flatMap$uList_selective_flatmap")
  }
  def division(a:Int,b:Int):Int={
    b/a
  }


  def main(args:Array[String])={
    val uList = List(1, 2, 3, 4, 5)
    L11_2(uList.toSeq)
    L11_3(uList.toVector)
    L11_4(uList.toSet)
    val answer=Try{
      uList.reduce((x,y)=>division(x,y))
    }.flatMap(
      x=> Try{
        x/x-1
      }
    )
    answer match{
      case Success(value)=>println(value)
      case Failure(exception)=>  println(s"Error: ${exception.getMessage}")
    }



  }
}
