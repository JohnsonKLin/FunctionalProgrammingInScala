package johnson.practice

import java.beans.SimpleBeanInfo

import org.apache.commons.beanutils.BeanUtils
import scala.beans.BeanProperty
/**
 * Created by linzhaosen on 15/1/18.
 */
object UsingJavaJar {
class SimpleBean(var name: String){}
  class SimpleBeanWithAnnotation(@BeanProperty var name: String){}
  def main(args: Array[String]) {
    val bean = new SimpleBean("foo1")
    println(BeanUtils.describe(bean))

    val beanWithAnnotation = new SimpleBeanWithAnnotation("foo2")
    beanWithAnnotation.setName("foo3")
    println(BeanUtils.describe(beanWithAnnotation))
    println(beanWithAnnotation.getName)
  }
}
