package johnson.basic

/**
 * Created by linzhaosen on 15/1/13.
 */
object DuckLike {
  def withClose(closeAble: {def close(): Unit; def doSomething(): Unit},
                op: {def close(): Unit; def doSomething(): Unit} => Unit) {
    try {
      op(closeAble)
    } finally {
      closeAble.close()
    }
  }

  class Connection {
    def close() = println("close connection")

    def doSomething() = println("do something")
  }

  def main(args: Array[String]) {
    val con: Connection = new Connection()
    withClose(con, con => con.doSomething())
  }

}
