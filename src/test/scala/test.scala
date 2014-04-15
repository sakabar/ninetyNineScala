import org.scalatest.FunSuite
import utils._

class SetSuite extends FunSuite {

  test("P01"){
    val expected : Int = 8
    val actual : Int = Utils.last(List(1,1,2,3,5,8))
    assert(expected === actual)
  }

  test("P02"){
    val expected : Int = 5
    val actual : Int = Utils.penultimate(List(1,1,2,3,5,8))
    assert(expected === actual)
  }

  test("P03"){
    val expected : Int = 2
    val actual : Int = Utils.nth(2, List(1,1,2,3,5,8))
    assert(expected === actual)
  }

  test("P04"){
    val expected : Int = 6
    val actual : Int = Utils.length(List(1,1,2,3,5,8))
    assert(expected === actual)
  }


  test("P05"){
    val expected = List(8,5,3,2,1,1)
    val actual = Utils.reverse(List(1,1,2,3,5,8))
    assert(expected === actual)
  }



}
