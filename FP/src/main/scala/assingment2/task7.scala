package assingment2

object task7 {

  //implicit for type conversions
  implicit def Int_2_String(n:Int)={
    n.toString
  }
  def main(args:Array[String])= {
    val num=5
    val str: String = num
    println(str, str.getClass)
    //notice i didnt define num to string but it converted
    //:)
  }
}
