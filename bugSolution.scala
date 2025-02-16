```scala
class MyClass(val x: Int) {
  def this() = this(11) // Auxiliary constructor, x is initialized to a safe value
  def myMethod(): Int = {
    if (x > 10) x else throw new IllegalArgumentException("x must be greater than 10")
  }
}

//Alternative solution:
class MyClass2(val x: Int) {
  def this() = this(0) 
  def myMethod(): Int = {
    if (x > 10) x else 0 //Handles the case where x is not greater than 10 
  }
}

object Main extends App{
  val obj = new MyClass()
  println(obj.myMethod())
  val obj2 = new MyClass2()
  println(obj2.myMethod())
}
```