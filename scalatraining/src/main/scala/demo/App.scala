package demo

import demo.Practice

object App {
  def main(args : Array[String]) {

    val practice = new Practice
    println(practice.getFrom1(List(1,5,3,4)))
    println(practice.getMostOccurring(Array("Indore","Chennai","Nashik","Patna")))
    println(practice.getAverage(List(Array(10,20,30),Array(5),Array(55,100))))
    println(practice.getMaxAmt(Map("Aswini"->7300,"Prajot"->8100,"Shivangi"->8300,"Komal"->8000)))


  }

}
