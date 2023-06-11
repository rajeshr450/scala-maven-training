package demo
import scala.collection.mutable.ListBuffer
class Practice {

  /**
   * """
   * Write a function which takes "List of Integers" as input and returns "List of Strings" such that each element has numbers from 1 to input element - as shown in the samples.
   * Note: Input number will always be greater than 0.
   * getFrom1(List(1,5,3,4)) = List(1,12345,123,1234)
   * getFrom1(List(10,6,7)) = List(12345678910,123456,1234567)
   * getFrom1(List(2,3,9)) = List(12,123,123456789)
   * getFrom1(List()) = List()
   *
   * @param in
   * @return list  result of string
   */
  def getFrom1(in: List[Int]): List[String] = {

    var res = new ListBuffer[String]()
    for (i <- in) {
      var str = ""
      for (j <- 1 to i) {
        str = str + j
      }
      res += str
    }
    res.toList
  }

  /**
   * Write a function which takes "Array of Strings" as input and returns "String"
   * "String" such that it has the most occurring character in entire set - as shown in the samples.
   * Note: - If more than one character occurs max number of times, return all of them.
   * - Only alphabets a-z is to be considered, case insensitive.
   *
   * getMostOccurring(Array("Indore","Chennai","Nashik","Patna")) = "n"
   * //Explanation: "n" occurs 5 times overall.
   * getMostOccurring(Array("Jalebi","Sandesh","Laddoo","Barfi","Kalakand")) = "a"
   * //Explanation: "a" occurs 7 times overall.
   * getMostOccurring(Array("Coffee")) = "fe"
   * //Explanation: "fe" occurs 2 times overall.
   *
   * @param input
   * * @return
   */
  //  getMostOccurring(Array("Indore","Chennai","Nashik","Patna"))
  def getMostOccurring(input : Array[String]) : String = {

    val word = input.mkString("")
    val groups = word.toList.map(x => (x,1)).groupBy(_._1)
    val reduceByKey = groups.mapValues(list => {
      list.map(_._2).sum
    })

    val max_val =  reduceByKey.values.max
    val res = reduceByKey.filter( _._2 == max_val).keys.mkString("")

    res

  }

  /**
   * Write a function which takes "List of Array of numbers" as input and returns "Int" such
   * that it is the overall average of all the numbers - as shown in the samples.
   *
   * getAverage(List(Array(10,20,30),Array(5),Array(55,100))) = 36.67
   * //Explanation: 10+20+30+5+55+100 => 220/6 = 36.67
   *
   * getAverage(List(Array(100,100),Array(200),Array(300,200))) = 180
   * //Explanation: 100+100+200+300+200 => 900/5 = 180
   *
   * getAverage(List(Array())) = 0
   *
   * @param input
   * @return
   */

  def getAverage(input : List[Array[Int]])={

    val res1 = input.reduceRight(_++_)
    val res = res1.sum.toFloat/res1.length
    res

  }

  /**
   * Write a function which takes "Map of String,Int" as input and returns "Int"
   * such that its largest value present in the value part of the input map - as shown in the samples.
   *
   * getMaxAmt(Map("Pawan"->5000,"Kiran"->2500,"Rajat"->8000,"Ajay"->1200)) = 8000
   *
   * getMaxAmt(Map("Srinivas"->9800,"Yogesh"->5300,"Shubham"->7500)) = 9800
   *
   * getMaxAmt(Map("Aswini"->7300,"Prajot"->8100,"Shivangi"->8300,"Komal"->8000)) = 8300
   */

  def getMaxAmt(input : Map[String,Int]) = {

    input.values.max
  }

}
