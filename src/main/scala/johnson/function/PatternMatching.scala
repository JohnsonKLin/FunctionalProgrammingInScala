package johnson.function

/**
 * Created by linzhaosen on 15/1/14.
 */
object PatternMatching {
  def fibonacci(in: Any): Int = in match {
    case 0 => 0
    case 1 => 1
    case n: Int => fibonacci(n-1) + fibonacci(n-2)
    case _ =>0
  }
  def test(i:Int):Any = i match {
    case 0 => println("zero")
    case 1 => println("one")
    case -1 => println("neg one")
  }

  def main(args: Array[String]) {
    println(fibonacci(10))
    println(fibonacci(1))
    println(fibonacci(0))
    //println(fibonacci(-1)) It will be stack overflow
    test(1)
    test(0)
    test(-1)
  }
}
