package demo

class Point(x:Int,y:Int) {
  override def toString: String = "(" + x + ", " + y + ")"
}

class ClassWithValParameter(val name: String)

object Classes{
  def main(args: Array[String]): Unit = {
    val pt = new Point(1,2)
//    println(pt)
//    val aClass = new ClassWithValParameter("Gandalf")
//    val left = 2
//    val right = 2
//    print(assert(left == right))


      def english = "Hi"

      def espanol = "Hola"


  }
}