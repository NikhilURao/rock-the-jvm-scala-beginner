package lectures.part1basics

object CBNvsCBV extends App {

  def CalledByValue (x : Long) : Unit = { // CBV the exact value of x is computed before the function evaluates and the same value is used in the function def.
                                          //value is computed before the call  and same value is used everywhere.
    println("Called By Value"+ x)
    println("Called By Value"+ x)

  }

  def CalledByName (x : => Long) : Unit = { // CBN the expression of x is passed as is into the function and is evaluated each time.
                                            //expression is passed as is and is evaluated at every use within

    println("Called By Name"+ x)
    println("Called By Name"+ x)
  }

  CalledByValue(System.nanoTime())
  CalledByName(System.nanoTime())

  def infintie () : Int = 1+ infintie()
  def printfirst(x : Int, y : => Int) : Unit = println(x) // note that x is CBV and y is CBN

  //printfirst(infintie(),34) // crashes with Stack Overflow error because the infinite() is evaluated first as x is CBV
  printfirst(34,infintie()) // Doesn't crash becuase the infinite() is not evailuated as y is CBN

}
