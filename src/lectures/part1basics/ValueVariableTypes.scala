package lectures.part1basics

object ValueVariableTypes extends App {//The App trait can be used to quickly turn objects into executable programs.

val x : Int = 3 //Values denoted by val cannot be reassigned i.e. a val is immutable
// val x = 5 will throw an error because val cannot be modified
val y = 3   //the type of the val if omitted, the compiler will infer the type

  val AnInteger : Int = 2
  val ACharacter : Char = 'a'
  val ABoolean : Boolean = false;val ABoolean2 : Boolean = true
  val AString : String = "Scala"
  val AFloat : Float = 2.2f
  val AShort : Short = 23456
  val ALong : Long = 23455057788L

var AVariable : Int = 5 //Variables are denoted by var can be reassigned/modified i.e. a var is mutable
  AVariable = 6 //Side Effects
}
