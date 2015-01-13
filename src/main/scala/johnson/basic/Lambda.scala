package linsen.basic

/**
 * Created by linzhaosen on 15/1/11.
 */
object Lambda {
  def lambdaTest(): Unit = {
    val list = List.range(1, 10)
    print("Before map function\n")
    print(list)

    print("After map function")
    print(list.map(x => x + 2))


    print("after filter function")
    print(list.filter(x => x > 5 && x < 7))
  }
}
