package linsen

/**
 * Created by linzhaosen on 15/1/11.
 */
object Functional {
  def functionaltest() {
    val x = List.range(1, 10)
    val y= x.map(_ * 2)
    print(y)
  }
}
