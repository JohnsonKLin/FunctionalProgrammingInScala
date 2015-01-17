package johnson.concurrent

/**
 * Created by linzhaosen on 15/1/17.
 */
object ParallelRead {
  val list = List("/Users/linzhaosen/TestJekyll/index.html", "/Users/linzhaosen/TestJekyll/feed.xml")
  val urls =  List("http://www.google.com", "https://github.com")

  def fromPath(path: String) = scala.io.Source.fromFile(path).getLines().mkString("\n")
  def fromURL(url:String) = println(scala.io.Source.fromURL(url).getLines().mkString("\n"))

  def main(args: Array[String]) {
    val t = System.currentTimeMillis()
    list.map(fromPath _)
    println("Normal read time " + (System.currentTimeMillis - t) + "ms")

    val t2 = System.currentTimeMillis()
    list.par.map(fromPath( _))
    println("Parallel read time "+ (System.currentTimeMillis() - t2)+ "ms")

    //urls.map(fromURL(_))


  }


}
