package exercises

import scala.annotation.tailrec

object RecursionsExercise extends App {
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
