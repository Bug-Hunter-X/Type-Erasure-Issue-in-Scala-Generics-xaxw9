```scala
class MyClass[T](val value: T) {
  def getValue: T = value
}

object Main extends App {
  val myInt = new MyClass(5)
  val myString = new MyClass("hello")

  println(myInt.getValue)
  println(myString.getValue)
}
```