package linsen.basic

object main {
  def main(args: Array[String]) {
    println("Hello, world!")
    //fibonacci test
    val fi= Fibonacci.fibonacci(10)
    println(fi)

    //functional test
    Functional.functionaltest()
    val fuc= Functional.functionaltest()

    fuc
    print()

    //High order


    //clusures
    HighOrder(Clusures.change,"b")


    //Lambda
    Lambda.lambdaTest()
  }
}
