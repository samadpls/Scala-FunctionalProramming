import  scala.annotation.tailrec
object task4 {
  @tailrec def recEven(arry:Array[Int],count:Int,idx:Int) : Int={
    if (idx>arry.length-1){
      count
    }
    else if (arry(idx)%2==0){
      recEven(arry, count+1, idx+1)

    }
    else{
      recEven(arry, count, idx+1)
    }
  }
  //using HOF
  def evenHOF(arr: Array[Int])={
    var count = arr.count(x=>x%2==0)
    count
  }
  def main(args: Array[String])={
    var ar1 = Array.fill(100)(util.Random.nextInt(100))
    println("Array was =",ar1.mkString(","))
    println("Even number from recursion is = ",recEven(ar1,0,0))
    var ar2 = Array.fill(100)(util.Random.nextInt(100))
    println("Array was =", ar2.mkString(","))
    println("Even number from HOF is = ", evenHOF(ar2))
  }
}
