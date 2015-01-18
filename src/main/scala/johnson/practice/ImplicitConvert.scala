package johnson.practice
import java.text.SimpleDateFormat

/**
 * Created by linzhaosen on 15/1/18.
 */
object ImplicitConvert {

  implicit def strToDate(str: String) = new SimpleDateFormat("yyyy-MM-dd").parse(str)

  def main(args: Array[String]) {
    println("2013-01-01 unix mate:"+"2013-01-01".getTime()/1000)
  }
}
