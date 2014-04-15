import org.scalatest.FunSuite
import utils._

class SetSuite extends FunSuite {

  test("P01"){
    val expected : Int = 8
    val actual : Int = Utils.last(List(1,1,2,3,5,8))
    assert(expected === actual)
  }


}
