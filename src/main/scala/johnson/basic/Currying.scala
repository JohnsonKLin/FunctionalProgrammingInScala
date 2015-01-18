package johnson.basic

/**
 * Created by linzhaosen on 15/1/13.
 */
object Currying {
  def withClose(closeAble: {def close(): Unit})
               (op: {def close(): Unit;} => Unit) {
    try {
      op(closeAble)
    } finally {
      closeAble.close()
    }
  }

  class Connection {
    def close() = println("close connection")
  }

  def main(args: Array[String]) {
    val conn: Connection = new Connection()
    withClose(conn)(conn => println("do something with connection"))
    //They are same
    withClose(conn) { conn => println("do something with connection")}
  }
}
