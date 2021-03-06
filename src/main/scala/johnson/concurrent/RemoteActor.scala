package johnson.concurrent

import akka.actor.{Actor, ActorSystem, Props}
import com.typesafe.config.ConfigFactory

/**
 * Created by linzhaosen on 15/1/17.
 */
object RemoteActor {
  implicit val system = akka.actor.ActorSystem("RemoteSystem")// ConfigFactory.load.getConfig("remote")

  class EchoServer extends Actor {
    override def receive: Receive = {
      case msg: String => println("echo" + msg)

    }
  }

  def main(args: Array[String]) {
    val server = system.actorOf(Props[EchoServer], name = "echoServer")
    val echoClient = system.actorFor("akka://RemoteSystem@127.0.0.1:2552/user/echoServer")

    echoClient ! "Hi Remote"
    system.shutdown()
  }


}
