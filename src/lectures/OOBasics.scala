package lectures.part2oops

object OOBasics extends App {

  val per = new Person("Siraj",25) // creating an instance of the class Person
  println(per.age)
  per.greet("Nikhil")
  per.greet()
}
//Constructors
class Person (val name : String, val age : Int) {
//body
  val x =2
  println(1+3)

//method

  def greet (name : String ): Unit = println(s"${this.name} says : hello, $name ")

  //overloading - Methods with same name but different signature i.e different number of parameters or paramters of different types and different return types
  // (signature name and data type of the parameters)

  def greet(): Unit = println(s"Hello my name is $name") //here name means this.name

  // multiple constructors

  def this(name : String ) = this(name ,0)


}

//class parameters are not fields. In order to convert them we need to pass the parameters as val




