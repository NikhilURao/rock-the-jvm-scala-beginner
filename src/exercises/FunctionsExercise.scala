package exercises

import scala.annotation.tailrec


object FunctionsExercise extends App {

  //1.Greeting Function
  def aGreetingFunction(Name: String, Age: Int): Unit = {
    println(s"Hi, My name is $Name and my age is $Age")

  }

  aGreetingFunction("Robin", 25)

  //2.Factorial Function

  def aFactorialFunction(num: Int): Int = {
    if (num <=0) 1
    else num * aFactorialFunction(num - 1)
  }
  println(aFactorialFunction(0))

  //3.A Fibonacci Function

  def aFibonacciFunction(n : Int) : Int = {

    if (n <=2) 1
    else aFibonacciFunction(n-1) + aFibonacciFunction(n-2)
  }
println(aFibonacciFunction(n=8))
//fib series : 1,1,2,3,5,8,13,21,..........

  //4.Test if a number is a prime

  def testifprime (num : Int) : Boolean = {
    def isprimeuntil(x : Int) : Boolean =
      if (x <= 1) true
      else num % x != 0 && isprimeuntil (x - 1)
  isprimeuntil(num / 2)
  }
  println(testifprime (2000))
}


