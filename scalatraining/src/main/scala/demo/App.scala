package demo

/**
 * @author ${user.name}
 */
//case class Experience(duration : Int, definition:Double,network:Network)
//sealed trait Primary
object App  extends Enumeration {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    println( "Hello World!" )
//    println("concat arguments = " + foo(Array("a","b","c")))
//    enum Network:
//      case Fixed, Mobile
//    val lowqual = 0.3
//    val highqual = 0.6
//    val thirtymin = 30*60
//    val highqualandMobile = Experience(thirtymin,highqual,Network.Moobile)
//    enum Primary:
//      case Red,Blue,Green

  }

}
