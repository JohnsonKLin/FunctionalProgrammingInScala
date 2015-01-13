package johnson.basic

import java.util

/**
 * Created by linzhaosen on 15/1/13.
 */
object Traits {
trait ForEachAble[A] {
  def iterator: java.util.Iterator[A]
  def foreach(f: A=>Unit)= {
    val iter = iterator
    while(iter.hasNext){
      f(iter.next)
    }
  }
}
  trait JsonAble{
    def toJson() = {

    }
  }

  def main(args: Array[String]) {
    val list = new util.ArrayList[Int]() with ForEachAble[Int]
    list.add(1); list.add(2)
    println("foreach:")
    println(list.foreach(x=> println(x+1)))
  }
}
