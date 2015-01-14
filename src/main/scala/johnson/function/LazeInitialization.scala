package johnson.function

/**
 * Created by linzhaosen on 15/1/14.
 */
object LazeInitialization {

  class BrowsURL(val url: String) {
    lazy val source = {
      println("fetching from url ...")
      scala.io.Source.fromURL(url).getLines().toList
    }
    //lazy val majorVersion = source.find(_.contains("not found"))
    //lazy val minorVersion  = source.find(_.contains("not found"))
  }
  val version = new BrowsURL("https://www.google.com")

  def main(args: Array[String]) {
    println("get scala version from " + version.url)
    //version.source.foreach(println _)
  }
}
