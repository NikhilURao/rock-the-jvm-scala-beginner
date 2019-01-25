package exercises

import lectures.part1basics.Functions.aGreetingFunction
//1.Greeting Function
object FunctionsExercise extends App {

  def aGreetingFunction(Name: String, Age: Int): Unit = {
    println(s"Hi, My name is $Name and my age is $Age")

  }

  aGreetingFunction("Robin", 25)

  //2.Factorial Function

  def aFactorialFunction(num: Int): Int = {
    if (num == 1) num
    else num * aFactorialFunction(num - 1)
  }
  println(aFactorialFunction(4))

  //3.A Fibonacci Function

  def aFibonacciFunction(n : Int) : Int = {

    if (n==1) 1
    else 1 + aFibonacciFunction(n-1)
  }
println(aFibonacciFunction(n=3))


  //4.Test if a number is a prime

  def testifprime (num : Int) : Boolean = {

    if (num % 2 == 0) false else true
  }
  println(testifprime (13))
}


