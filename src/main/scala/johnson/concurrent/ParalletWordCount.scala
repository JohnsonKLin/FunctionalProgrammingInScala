package johnson.concurrent

/**
 * Created by linzhaosen on 15/1/17.
 */
object ParalletWordCount {
  val file = List("warn 2013 msg", "warn 2012 msg", "error 2013 msg", "warn 2013 msg")

  def wordCount(str: String): Int = str.split(" ").count("msg" == _)

  def main(args: Array[String]) {
    val num = file.par.map(wordCount).par.reduceLeft(_+_)
    println(num)
  }

}
