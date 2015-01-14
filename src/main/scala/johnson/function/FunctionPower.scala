package johnson.function

/**
 * Created by linzhaosen on 15/1/14.
 */
object FunctionPower {
  val list = List(1, 2, 3, 4)

  def containsOdd(list: List[Int]): Boolean = {
    for (i <- list) {
      if (i % 2 == 1) {
        return true;
      }
    }
    return false;
  }

  def main(args: Array[String]) {
    println(containsOdd(list))
    val list2 = List(2, 4)
    println((containsOdd(list2)))

    //There is anther simple way to do that
    println(list.exists((x: Int) => x % 2 == 1))

    //There is second simple way to do that
    println(list.exists(_ % 2 == 1))

  }

}
