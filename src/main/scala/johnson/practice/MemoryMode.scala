package johnson.practice

import scala.collection.mutable.WeakHashMap

/**
 * Created by linzhaosen on 15/1/18.
 */

object MemoryMode {


  def main(args: Array[String]) {
    val cache = new WeakHashMap[Int, Int]

    def memo(f: Int => Int) = (x: Int) => cache.getOrElse(x, f(x))

    def fibonacci_(in: Int): Int = in match {
      case 0 => 0
      case 1 => 1
      case n: Int => fibonacci_(n - 1) + fibonacci_(n - 2)//case n: Int => memo(fibonacci_)(n - 1) + memo(fibonacci_)(n - 2)
    }
    val fibonacci: Int => Int = memo(fibonacci_)
    val t1 = System.currentTimeMillis()
    println(fibonacci(43))
    println("It talks " + (System.currentTimeMillis() - t1) + "ms")
    val t2 = System.currentTimeMillis()
    println(fibonacci(43))
    println("It talks "+ (System.currentTimeMillis()-t2)+"ms")

    val t3 = System.currentTimeMillis()
    println(fibonacci_(43))
    println("It talks " + (System.currentTimeMillis() - t3) + "ms")
    val t4 = System.currentTimeMillis()
    println(fibonacci_(43))
    println("It talks "+ (System.currentTimeMillis()-t4)+"ms")
  }
}
