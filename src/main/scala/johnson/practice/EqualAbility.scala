package johnson.practice

/**
 * Created by linzhaosen on 15/1/18.
 */
object EqualAbility {

  class Person(val name: String) {
    override def equals(other: Any) = other match {
      case that: Person => name.equals(that.name)
      case _ => false
    }
  }

  def main(args: Array[String]) {
    println(new Person("A") == new Person("B"))
    println(new Person("A")== new Person("A"))
  }

}
