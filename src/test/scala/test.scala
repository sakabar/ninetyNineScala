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

  test("P06"){
    val expected = true
    val actual = Utils.isPalindrome(List(1,2,3,2,1))
    assert(expected === actual)
  }

  test("P07-1"){
    val expected = List(1,1,2,3,5,8)
    val actual = Utils.flatten(List(List(1,1,2), 3, List(5,8)))
    assert(expected === actual)
  }

  test("P07-2"){
    val expected = List()
    val actual = Utils.flatten(List())
    assert(expected === actual)
  }

  test("P07-3"){
    val expected = List(1,2)
    val actual = Utils.flatten(List(1,2))
    assert(expected === actual)
  }

  test("P07-4"){
    val expected = List(1,2,3)
    val actual = Utils.flatten(List(1,List(2,3)))
    assert(expected === actual)
  }

  test("P08"){
    val expected = List('a, 'b, 'c, 'a, 'd, 'e)
    val actual = Utils.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    assert(expected === actual)
  }

  test("P09-1"){
    val expected = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
    val actual = Utils.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    assert(expected === actual)
  }

  test("P09-2"){
    val expected = List(List('a), List('b))
    val actual = Utils.pack(List('a, 'b))
    assert(expected === actual)
  }

  test("P10-1"){
    val expected = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
    val actual = Utils.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    assert(expected === actual)
  }

  test("P11-1"){
    val expected = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
    val actual = Utils.encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    assert(expected === actual)
  }

  test("P12-1"){
    val expected = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val actual = Utils.decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
    assert(expected === actual)
  }


}
