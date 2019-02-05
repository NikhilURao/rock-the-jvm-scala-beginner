package lectures.part1basics

object DefaultArgs extends App {

  def Savepic (format : String, width : Int, height : Int) : Unit = println("saving picture")

  def Savepicdefault (format : String = "jpg", width : Int, height : Int) : Unit = println("saving picture")

 /*
 1.Pass in all the leading argument
 2.name the arguments
  */
}
