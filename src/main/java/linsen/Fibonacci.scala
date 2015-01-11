package linsen

object Fibonacci {
  def apply(i: Int): Int = fibonacci(i)

  def fibonacci(current: Int): Int = {
    if (current == 0 || current == 1) current
    else fibonacci(current - 1) + fibonacci(current-2)
  }

}