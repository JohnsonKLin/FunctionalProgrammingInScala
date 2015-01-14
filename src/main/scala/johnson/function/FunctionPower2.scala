package johnson.function

/**
 * Created by linzhaosen on 15/1/14.
 */
object FunctionPower2 {
  val file = List("warn 2013 msg", "warn 2012 msg", "error 2013 msg", "warn 2013 msg")

  def main(args: Array[String]) {
    println(file.filter(_.contains("error")).filter(_.contains("2013")).filter(_.contains("msg")).size)
  }
}
