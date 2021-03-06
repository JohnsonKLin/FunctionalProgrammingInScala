package johnson.function

/**
 * Created by linzhaosen on 15/1/14.
 */
object CaseClasses {

  abstract class Expr

  case class FibonacciExpr(n: Int) extends Expr {
    require(n >= 0)
  }

  case class SumExpr(a: Expr, b: Expr) extends Expr

  def value(in: Expr): Int = in match {
    case FibonacciExpr(0) => 0
    case FibonacciExpr(1) => 1
    case FibonacciExpr(n) => value(SumExpr(FibonacciExpr(n - 1), FibonacciExpr(n - 2)))
    case SumExpr(a, b) => value(a) + value(b)
    case _ => 0
  }

  ////////////////


  case class dog() {
     def buck() = {
      println("Wang wang")
    }
  }

  case class cat()  {
     def buck() = {
      println("Miao miao")
    }
  }

  def makeBulk(animal: Any) = animal match {
    case dog() => {println("I am dog")
    }
    case cat() => { println("I am cat")
    }
  }

  def main(args: Array[String]) {
    println(value(FibonacciExpr(10)))
    val c = new cat()
    val d = new dog()
    makeBulk(c)
    makeBulk(d)
  }

}
