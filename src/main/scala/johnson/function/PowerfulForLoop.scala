package johnson.function

/**
 * Created by linzhaosen on 15/1/14.
 */
object PowerfulForLoop {
  val file = List("warn 2013 msg", "warn 2012 msg", "error 2013 msg", "warn 2013 msg")

  def wordCount(str: String): Int = str.split(" ").count("msg" == _)

  val counts =
    for (word <- file)
    yield wordCount(word)


  def main(args: Array[String]) {
    println(counts.reduce(_ + _))
  }

}
