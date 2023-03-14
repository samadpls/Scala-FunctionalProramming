object ex3 {
 //option function is used to handle the none type
  // it will wrap the value in Some() instance if the value exist or None if not
  def task[T](name:String,work:Option[T])={
    // using case here it is used for matching patterns
    val output= work match {
      case Some(workvalue) => s"My work is ${work}"
      case None => s"${name} will do rest today"


    }
    output
  }
  def main(args: Array[String])={
    println(task("ali",None))
    println(task("Omer",Some("Assingments")))

  }
}
