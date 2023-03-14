import scala.util.Random
object task1 {
  def primecheck(arry: Array[Int], result : List[Int]=Nil): List[Int] = {
    if (arry.isEmpty) {//Nil means creating empty list
      result //means it iterate the whole array
    }
    else {
      val n = arry.head //pop the first element
      def prime(div: Int): Boolean = {
        if (div == 1) {
          true //passes all the test
        }
        else if (n % div == 0) {
          false //n is accessible cuz its inside the fucntion
        }
        else {
          prime(div - 1) // recursion hori ha
        }
      }
      if (prime(n - 1)) {// means true
        primecheck(arry.tail, result :+ n) // as we know the tail means all the array without the first item so it is passing the
        //array with +1 index :) and appending in the list the prime value in result list
      }
      else {
        primecheck(arry.tail, result)
      }
    }

  }





  //random integer array and perform task
  def main(args : Array[String])= {
    var list = (1 to 15).map(_=> Random.between(50, 500)).toArray //cuz it was making it into array
    println(list.mkString(","))
    var prime_numbers= primecheck(list)
    println(prime_numbers)
    prime_numbers.sorted
    println(prime_numbers.mkString(","))
    var mapping= Map(prime_numbers.zipWithIndex:_*)// i can also do it with reusrion but this easy
    println(mapping)

  }
}
