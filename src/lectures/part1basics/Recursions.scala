package lectures.part1basics

import scala.annotation.tailrec

object Recursions extends App {

  def afactorialfunction(num: Int): Int = {
    if (num == 1) 1
    else {
      println("Calcualting the factorial of " + (num - 1) + "In order to find the factorial of " + num + ", we need the factorial of" + (num - 1))
      val result = num * afactorialfunction(num - 1)
      println("Factorial of " + (num - 1) + "calculated")

      result
    }
  }

  //println(afactorialfunction(5000))

  // This improved function is wriiten using tail recursion
  def improvedfactorial(num: Int): BigInt = {
    @tailrec // Annotation to tail recursive for the below function
    def factorialhelper(n: Int, accumulator: BigInt): BigInt =
      if (n <= 1) accumulator
      else factorialhelper(n - 1, n * accumulator) //TAIL RECURSION

    factorialhelper(num, 1)
  }

  println(improvedfactorial(5000))

  // WHEN YOU NEED LOOPS, USE TAIL RECURSION

  //Exercise

  //1. String Concat tail recursive function
  @tailrec
  def StringConcatTailRec(Name: String, n: Int, acc: String): String = {
    if (n <= 0) acc
    else StringConcatTailRec(Name, n - 1, Name + acc)
  }

  println(StringConcatTailRec("Nikhil", 4, ""))


  //2. IsPrime tail recursive function
  def IsPrimeTailRec(n: Int): Boolean =
  {
    @tailrec
    def IsPrimehelper(t : Int, IsStillPrime : Boolean) :Boolean = {
      if (IsStillPrime == false) false
      else if (t <= 1) true
      else IsPrimehelper(t - 1, n % t != 0 && IsStillPrime)
    }
    IsPrimehelper(n/2,true)

  }
  //3. Fibonacci Series

  def FibonacciTailRec(num : Int) : Int =
  {
    @tailrec
    def FibonacciHelper (t :Int, Last : Int, NextToLast : Int) : Int =
  {
    if (t >= num) Last
    else FibonacciHelper(t+1,Last + NextToLast,Last)
  }
  if (num <=2) 1
  else FibonacciHelper(2,1,1)
  }
println(FibonacciTailRec(3))
}