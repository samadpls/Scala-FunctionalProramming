object ex2 {
 def main(args: Array[String])={
   var set1=Set[String]()
   var map1= Map(
     ("item1",1),
     ("item2","value2")
   )
   set1+="HI"
   map1+=("item"->3)
   println(s"First Set contains elements ${set1}")
   println(s"First Map contains elements ${map1}")
   //for doing it with val we need to import the library called scala.collection.mutable.set
   //we can either import it or simply just use it in a single line
   val set2 =scala.collection.mutable.Set("I am")
   set2+="Mutable"
   println(s"Second Set contains elements ${set2}")
 }
}
