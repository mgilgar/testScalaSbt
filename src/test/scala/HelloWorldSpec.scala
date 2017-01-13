import org.scalatest.WordSpec
import org.scalatest.Matchers._
import org.mockito.Matchers.{eq => eqTo, _}
import org.mockito.Mockito._
import org.scalatest.mock.MockitoSugar

/**
  * Created by miguelgil_garcia on 11/01/2017.
  */
class HelloWorldSpec extends WordSpec with MockitoSugar {
  "message" should {
    "return message" in {
      HelloWorld.transformMessage shouldBe("Hello World!")
    }
  }

  "message" should {
    "return message when mocked" in {
      val mockMessageGenerator = mock[MessageGenerator]
      when(mockMessageGenerator.message()).thenReturn("my message")
      val testableHelloWorld = new HelloWorld(mockMessageGenerator)
      testableHelloWorld.transformMessage() shouldBe("my message!")
    }
  }
}
