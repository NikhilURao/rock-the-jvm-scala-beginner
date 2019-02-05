package lectures.part1basics

object StringOps extends App {

  val str : String = "Hey, I am learning Scala"
  println(str.charAt(3))
  println(str.split(",").toList)
  println(str.substring(7,11))
  println(str.startsWith("Hey"))
  println(str.replace(" ","-"))
  println(str.toLowerCase)
  println(str.length)
  println(str.reverse)

  val NumberString = "1234"
  val Number = NumberString.toInt
  println(Number)

  println('a' +: NumberString :+ 'z')

  //Scala Specific
  //String Interpolators

  //S Interpolators

  val Name = "Nikhil"
  val age = 24
  val greeting = s"Hello , my name is $Name and I am $age years old"
  println(greeting)

  //F Interpolators - for formated strings in a printf fashions. starts with f""
  val rate = 1.2F
  val myth = f"$Name can eat $rate%2.2f burgers per minute"// %2.2f 2characters and 2 precisons
  println(myth)

  //Raw Interpolators
  println(raw" This is a new line \n ")

}
