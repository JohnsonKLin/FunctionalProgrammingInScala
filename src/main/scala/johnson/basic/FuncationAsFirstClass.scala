package johnson.basic

/**
 * Created by linzhaosen on 15/1/13.
 */
object FuncationAsFirstClass {
  def square(a: Int) = a * a

  def squareWithBlock(a: Int) = {
    a * a
  }

  val squareVal = (a: Int) => a * a

  def addOne(f:Int=>Int,arg:Int)={
    f(arg)
  }
  def main(args: Array[String]) {

    println(square(4))
    println(squareWithBlock(5))
    println(addOne(squareVal, 6))

  }
}
