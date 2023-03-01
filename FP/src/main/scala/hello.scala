object hello {
  def adder(n: Int)={
    if (n>2){
      n+n
    }
    else {
      n-6
    }
  }
  def fib(n: Int):Int = {
    def loop(a:Int): Int = {
      if (a<2) {
        a
      }
      else{
        loop(a-1) + loop(a-2)
      }
    }
    loop(n)
  }
  private def str(x:Int) ={
    val msg= "My number is %d and it returned me %d"
    msg.format(x,adder(x))
  }
  def  main(args: Array[String])={
    println(str(5))
    println(fib(4))
  }
}
