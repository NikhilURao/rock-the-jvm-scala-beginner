package exercises

import java.io.Writer

/*
1. Novel and Writer

Writer : First Name, Last Name , Age
-method that returns the Full Name of the author

Novel : Name, year of release, author name
- method that returns the author's age at the release of a novel
- iswrittenby (Author)
-copy (new year of release = new instance of novel)

2.Counter Class

-receives an Int value
-method that receives the current count
-method to increment/decrement the count by 1=> new Counter
-overload inc/dec to receive an amount to increase and decrease the count => new Counter
*/

object OOExercise extends App {

  val author = new Writer ( "Shivaram Karanth", "Kota" ,1902)
  author.returnFullName()
  val novel = new Novel("Mookajjiya Kanasugalu", 1968,author)
  println(novel.AuthorAge())
  println(novel.IsWrittenBy(author))
  println(novel.copy(1972))
  println(novel.yor)


  val count= new Counter(2)
  count.inc.print
  count.inc(3).print
  count.dec.print
  count.dec(2).print
}

class Writer (firstname : String , lastname : String , val yob : Int) {

  def returnFullName(): Unit = {
    val fullname = firstname + " " + lastname
    println(s"The full name of the author is $fullname")
  }
}

class Novel ( name : String, val yor : Int , val author : Writer) {

def AuthorAge() : Int = yor - author.yob
def IsWrittenBy(author :Writer) = author == this.author
def copy (newyear : Int): Novel = new Novel(name,newyear,author)
}
/*
class Counter(num :Int) {

  def IncDec() : Unit = {
    //val Incby1 = num + 1
    //val Decby1 = num - 1
  println(num + 1,num - 1)}

def IncDec (n : Int) ={
//val Incbyn = num + n*1
//val Decbyn = num - n*1
println(num + n*1, num - n*1)}
}
*/
class Counter(val num :Int) {

  def inc = {
    println("Incrementing")
    new Counter(num +1)
  }

  def dec = {
    println(s"Decrementing")
    new Counter(num -1)
  }

  def inc(n: Int): Counter ={
    if (n<=0) this
    else inc.inc(n-1)
  }

  def dec(n : Int) : Counter= {
    if (n<=0) this
    else dec.dec(n-1)

  }
  def print = println(num)
}