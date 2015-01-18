package johnson.practice
import scala.util.matching.Regex


/**
 * Created by linzhaosen on 15/1/18.
 */
object Abstractor {
  object Email{
    def unapply(str: String) = new Regex("""(.*)@(.*)""")
      .unapplySeq(str).get match {
      case user::domain::Nil => Some(user, domain)
      case _ => None
    }
  }

  def main(args: Array[String]) {
    "zhaosen.lin@oracle.com" match {
      case Email(user, domain) => println(user + "@" + domain)
    }
    try {
      "" match {
        case Email(user, domain) => println(user + "@" + domain)
      }
    }
    catch {
      case _ => println("Exception")
    }

  }
}
