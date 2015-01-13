package linsen.basic

/**
 * Created by linzhaosen on 15/1/11.
 */
object HighOrder {
  def apply(f: String => Int, s: String) {
    f(s)
  }
}
