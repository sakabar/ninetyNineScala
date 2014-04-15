import org.scalatest.FunSuite

class SetSuite extends FunSuite {

  test("use '==='"){
    val expected : Int = 1 + 1
    val actual : Int = 2
    assert(expected === actual)
  }


}
