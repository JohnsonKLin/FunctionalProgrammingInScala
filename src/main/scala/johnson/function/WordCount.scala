package johnson.function

/**
 * Created by linzhaosen on 15/1/14.
 */
object WordCount {

  val file = List("warn 2013 msg", "warn 2012 msg", "error 2013 msg", "warn 2013 msg")

  def wordCount(str: String): Int = str.split(" ").count("msg" == _)

  def main(args: Array[String]) {
    val result = file.map(wordCount).reduceLeft(_ + _)
    println(result)
  }
}
