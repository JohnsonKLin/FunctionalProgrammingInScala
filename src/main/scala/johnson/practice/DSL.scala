package johnson.practice
//import org.json4s._
//import org.json4s.JsonDSL._
//import org.json4s.jackson.JsonMethods._
import java.util.Date
/**
 * Created by linzhaosen on 15/1/18.
 */
object DSL {
case class Twitter(id: Long, text: String, publishedAt: Option[java.util.Date])

//var twitters = Twitter(1, "hello scala", Some(new Date())) ::
//Twitter(2, "I like scala tour", None) :: Nil
//
//var json = ("twitters"
//-&gt; twitters.map(
//t =&gt; ("id" -&gt; t.id)
//~ ("text" -&gt; t.text)
//~ ("published_at" -&gt; t.publishedAt.toString())))
//
//println(pretty(render(json)))



}
