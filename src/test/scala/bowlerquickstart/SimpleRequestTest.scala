package bowlerquickstart


import org.scalatra.test.scalatest.ScalatraFunSuite
import org.bowlerframework.http.BowlerFilter


class SimpleRequestTest extends ScalatraFunSuite{
  val holder = this.addFilter(classOf[BowlerFilter], "/*")

  test("Simple Controller Route"){
	// let's run the bootstrap of the app
    val bootstrap = new Bootstrap
    get("/"){
	 println(body)
	  // lets just check that the body of the response contains the text in the index.mustache view file.
      assert(body.contains("This is the index view!"))
    }
  }
}