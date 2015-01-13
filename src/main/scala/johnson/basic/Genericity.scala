package johnson.basic

/**
 * Created by linzhaosen on 15/1/13.
 */
object Genericity {
  def withClose[A <: {def close() : Unit}, B](closeAble: A)(f: A => B): B =
    try {
      f(closeAble)
    } finally {
      closeAble.close()
    }

  class Connection {
    def close() = println("close connection")
  }

  def main(args: Array[String]) {
    val conn: Connection = new Connection()
    val msg = withClose(conn) { conn => {
      println("do something")
      12345
    }
    }
    print(msg)
  }

}
