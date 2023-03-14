package assingment2

object task8 extends App{
  //implicit for type conversions
  implicit def concat(n1:Any,n2:Any) = {
    s"$n1$n2"
  }

    val num = 5
    val list=List(1,2,3)
    val ans= concat(num,list)
    println(ans,ans.getClass)



}
