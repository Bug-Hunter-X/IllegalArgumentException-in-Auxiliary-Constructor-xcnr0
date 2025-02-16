```scala
class MyClass(val x: Int) {
  def this() = this(0) // Auxiliary constructor
  def myMethod(): Int = {
    if (x > 10) x else throw new IllegalArgumentException("x must be greater than 10")
  }
}

object Main extends App{
  val obj = new MyClass()
  println(obj.myMethod())
}
```