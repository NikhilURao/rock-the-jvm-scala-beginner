package lectures.part1basics

import scala.annotation.tailrec

object Recursions extends App {

  def afactorialfunction (num : Int) : Int = {
    if (num == 1) 1
    else {
      println("Calcualting the factorial of "+ (num-1) +"In order to find the factorial of " + num + ", we need the factorial of"+ (num -1))
     val result = num * afactorialfunction(num - 1)
      println("Factorial of "+ (num -1) +"calculated")

      result
    }
  }
  //println(afactorialfunction(5000))

// This improved function is wriiten using tail recursion
  def improvedfactorial (num : Int) : BigInt =
  {
    @tailrec // Annotation to tail recursive for the below function
    def factorialhelper(n : Int, accumulator : BigInt) : BigInt =
      if (n <= 1) accumulator
      else factorialhelper(n-1 ,n * accumulator)//TAIL RECURSION

    factorialhelper(num, 1)
  }

println(improvedfactorial(5000))

  // WHEN YOU NEED LOOPS, USE TAIL RECURSION

//Exercise

  //1. String Concat tail recursive function
@tailrec
  def improvedstringconcat (Name : String, num : Int) : String =
  {
    def stringconcathelp ()
    if(num == 1) Name
    else Name + improvedstringconcat(Name, num -1)
  }





}


