package lectures.part1basics

object Expressions extends App { //The App trait can be used to quickly turn objects into executable programs.

  val x = 1 + 2 //Expression - Something which returns a value
  println(x)

  println(1+2*3) //Math Expression
//Math operators : +,-, *,/,&,|,^,<<,>>,>>> (right shift with zero extension)

  println(2==3)//relational operation
  // ==,!=,<,>,<=,>=

  println (!(1==3)) //unary and binary operators
  // ! && ||

  var avariable = 3
  avariable +=2 //changing a variable or side effects
  println(avariable)

  //INSTRUCTIONS vs EXPRESSIONS
  //Instructions are executed and are commanding the computer to do something. In imperative languages like Java and Python we use Instructions. BUT NO IN SCALA
  //Expressions are evaluated and are somethings that have a value and type. USED IN SCALA

  //IF CONDITION is an Expression
  val avalue = true
  val IfCondition = if (avalue) 7 else 4
  println(IfCondition)

  //LOOPS IN SCALA ARE DISCOURAGED. Please look below for explanation. Scala forces everything to be an expression.

  val aWeirdValue = (avariable =3)//  returns type unit i.e. () equivalent to void
  println(aWeirdValue)// side effects return unit eg: reassigning a variable,while loop, println()

  //CODE BLOCKS
val ACodeBlock = {
  val x : Int = 2
  val z : Int = 3
  if (x == z) "Equals" else "Not Equals"
}
println(ACodeBlock)// A Code Block is an expression. Val declared inside a code block cannot is local to that code block.








}
