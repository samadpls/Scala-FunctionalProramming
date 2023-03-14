package assingment2

object ex4 {
  def L11_2(uList:List[Int])={

    val uList_Twice = uList.map(_ * 2)
    println(s"List element doubled- $uList_Twice")
    def f(x:Int)= if (x>2) x*x else None
    val uList_Squared = uList.map(f(_))
    println(s"List elements squared selectively - $uList_Squared")
  }
  def L11_3(uList:List[Int])={
    def g(v:Int)=List(v-1,v,v+1)
    val uList_Extended = uList.map(g(_))
    println(s"Extended list using map -$uList_Extended")
    val uList_Extended_flatmap =uList.flatMap(g(_))
    println(s"Extended list using flatMap -$uList_Extended_flatmap")

  }

  def L11_4(uList: List[Int]) = {

    val uList_Twice = uList.map(_ * 2)
    println(s"List element doubled- $uList_Twice")

    def f(x: Int) = if (x > 2) Some(x) else None

    val uList_selective = uList.map(f(_))
    println(s"Selective element of List  with .map - $uList_selective")

    val uList_selective_flatmap= uList.flatMap(f(_))
    println(s"Selective element of List  with .flatMap$uList_selective_flatmap")
  }
  def L11_5(uMap:Map[Char ,Int])={
    val uMap_mapValues=uMap.mapValues(_*2).toMap
    println(s"Map values doubled using .mapValues - $uMap_mapValues")

    def h(k:Int,v:Int)=Some(k->v*2)
    val uMap_map=uMap.map{
      case (k,v) => h(k,v)

    }
    println(uMap_map)
  }
  def main(args:Array[String])={
    val uList = List(1, 2, 3, 4, 5)
    val umap= Map('a'-> 2, 'b' -> 4,'c' -> 6)
    L11_2(uList)
    L11_3(uList)
    L11_4(uList)
    L11_5(umap)


  }
}
