import play.api.libs.json._

case class Order(product: Int, price: Int, quantity: Int)

// "Vertical slicing"
// https://github.com/dlresende/extreme-carpaccio/tree/master/clients

case object Order {
  implicit val orderFormats = Json.format[Order]
}


case class MessageGenerator() {
  def message() = {
    "Hello World"
  }
}

case object MessageGenerator {

}

class HelloWorld(messageGenerator: MessageGenerator) {
  import Order.orderFormats

  def transformMessage() = {
    messageGenerator.message() + "!"
  }
  val myOrder = Order(1, 2, 10)
  println(s"json: ${Json.toJson(myOrder)}")
  val myJson = Json.toJson(myOrder)
  val fromJson = Json.fromJson[Order](myJson)
  println(s"class: ${fromJson}")
}

object HelloWorld extends HelloWorld(MessageGenerator()) with App {
  println(transformMessage())
}


