package johnson.basic


/**
 * Created by linzhaosen on 15/1/13.
 */
object CallbyName {
  val logEnable = true

  def log(msg: => String) =
    if (logEnable) println(msg)

  val MSG = "This is message"

  def main(args: Array[String]) {
    log(MSG + 1 / 0) // my example is not working
  }

}
