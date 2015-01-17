package johnson.concurrent

import akka.actor.{Actor, ActorSystem, Props}
import akka.actor.ActorDSL._

/**
 * Created by linzhaosen on 15/1/15.
 */
object ActorExample {
  val system = ActorSystem()

  class EchoServer extends Actor {
    def receive = {
      case msg: String => println("echo" + msg)

    }
  }

  implicit val system2 = ActorSystem()
  val echoServer2 = actor(new Act {
    become {
      case msg => println("echo " + msg+" Thread "+ Thread.currentThread().getName)
    }
  })

  def main(args: Array[String]) {
    //Example 1
    val echoServer = system.actorOf(Props[EchoServer])
    echoServer ! " hi"
    system.shutdown()

    //Example2

    echoServer2 ! "hi2"
  }
}

