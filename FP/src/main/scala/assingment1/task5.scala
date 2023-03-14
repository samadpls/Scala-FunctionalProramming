import  scala.annotation.tailrec
object task5 {
  def buildMap[A,B](data:Seq[A],f:A=>B):Map[A,B]={
  var map=Map[A,B]()
  @tailrec def mapping(data:Seq[A],map:Map[A,B]): Map[A, B] ={
    if (data.isEmpty){
      map
    }
    else {
      mapping(data.tail,map+(data.head->f(data.head)))
    }


  }
    mapping(data, map)
  }
  def main(args:Array[String]): Unit = {
    // Example
    val lst = Array(1, 2, 3, 4, 5)

    def func(x: Int): Boolean = x % 2 == 0 // entry is even or not

    val result = buildMap(lst, func)
    println(result)
  }
}
