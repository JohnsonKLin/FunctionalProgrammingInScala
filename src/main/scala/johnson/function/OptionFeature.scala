package johnson.function

/**
 * Created by linzhaosen on 15/1/14.
 * This feature solve the problem of nullpointexception
 */
object OptionFeature {
  def getProperty(name: String): Option[String] = {
    val value = System.getProperty(name)
    if (value != null)
      Some(value)
    else None
  }

  val osName = getProperty("os.name")
  osName match {
    case Some(value) => println(value)
    case _ => println("none")

  }

  def main(args: Array[String]) {
    println(osName.getOrElse("none"))
    osName.foreach(print _)
  }
}
