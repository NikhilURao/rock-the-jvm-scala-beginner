package lectures.part1basics

object Functions extends App{

  //Function definition --- def functionName (parameter1 : Type, parameter2 : Type,.....) : Return Type = {Function Implementation}
  //Function Call --- functionName(parameter1,parameter2,...)
  def aFunction(a : String, b : Int): String =
  {
    a + "" + b
  }

  println(aFunction("Nikhil",3))// Function Call


  def aparameterlessFunction () : Int = 21
  println(aparameterlessFunction())
  println(aparameterlessFunction)


  //In a functional language like Scala always use recursion rather than iteration or loops. See below for an example
  def arecursiveFunction(a: Int,b :Int ) : Int =
  {
    if(b == 1) a
    else a * arecursiveFunction(a,b-1)
  }
  println(arecursiveFunction(3,2))

  def arecursiveFunction2 (a: String,b: Int) : String =
    {
      if (b == 1) a
      else a + arecursiveFunction2 (a, b-1)
    }
  println(arecursiveFunction2 ("Nikhil",2))
//Exercise
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


  //4.Test if a number is a prime

  def testifprime (num : Int) : Boolean = {
    def isprimeuntil(x : Int) : Boolean =
      if (x <= 1) true
      else num % x != 0 && isprimeuntil (x - 1)
    isprimeuntil(num / 2)
  }
  println(testifprime (2000))

}
