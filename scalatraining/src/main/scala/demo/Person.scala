package demo

import demo.Person.showme

class Person(val a : String,private val b : String)

object Person{
  def showme(x: Person) = x.b
}

object myobj {
  def main(args : Array[String]){
  val aa = new Person("bb", "dd")
  print(Person.showme(aa))
}}
