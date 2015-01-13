package johnson.basic

/**
 * Created by linzhaosen on 15/1/13.
 */
object DefineClass {
  class Persion(val firstName:String , val lastName: String){
    private var _age=0;
    def age = _age
    def age_= (newAge: Int) = _age = newAge
    def fullName( ) = firstName + " "+ lastName
    override def toString() = fullName()
  }



  def main(args: Array[String]) {
    val obama: Persion = new Persion("Barack", "Obama")
    println("Persion:" + obama)
    println("firstName:" + obama.firstName)
    println("lastName:" + obama.lastName)
    obama.age_=(51)
    println("age:" + obama.age)

  }
}
