package johnson.concurrent

import akka.actor.ActorDSL._
import akka.pattern.ask

/**
 * Created by linzhaosen on 15/1/17.
 */
object SynchronizedAsynchronizedReturn {

  def main(args: Array[String]) {

    implicit val ec = scala.concurrent.ExecutionContext.Implicits.global
    implicit val system = akka.actor.ActorSystem()
    val path = "/Users/linzhaosen/TestJekyll/index.html"
    val fromURL = actor(new Act {
      become {
        case url: String => sender ! scala.io.Source.fromFile(path).getLines().mkString("\n")
      }
    })
    val synchronizedVersion = fromURL.ask(path)(akka.util.Timeout(5 * 1000))
    synchronizedVersion.foreach(println _)
    
    val asychronizedVersion= fromURL.ask(path)(akka.util.Timeout(5 * 1000))
    asychronizedVersion onComplete{
      case msg => println(msg);system.shutdown
    }
    
  }
}
