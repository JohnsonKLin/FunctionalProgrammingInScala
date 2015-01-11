package linsen

/**
 * Created by linzhaosen on 15/1/11.
 */
object Clusures {
  def change(s: String): Int = {
    val y = 2
    s match {
      case ("a") => 1 + y
      case ("b") => 2 + y
      case _ => 0 + y
    }
  }
}
