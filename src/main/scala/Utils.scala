package utils

object Utils{
  def last(lst: List[Int]) = lst.reverse.head

  def penultimate(lst: List[Int]) = lst.reverse.tail.head

  def nth(n: Int, lst: List[Int]): Int = {
    if (n == 0){
      return lst.head
    }
    else{
      return nth(n-1, lst.tail)
    }
  }

  def length(lst: List[Int]): Int = {
    if (lst.isEmpty){
      return 0
    }
    else{
      return length(lst.tail) + 1
    }
  }

  def reverse(lst: List[Int]): List[Int] = {
    if (lst.isEmpty){
      return Nil
    }
    else{
      return reverse(lst.tail) ::: List(lst.head)
    }
  }

  def isPalindrome(lst: List[Int]): Boolean = lst == lst.reverse

  def flatten(lst: List[Any]): List[Any] = {
    if (lst.isEmpty){
      Nil
    }
    else{
      lst.head match {
	case l :List[Any] => flatten(l) ::: flatten(lst.tail)
	case n :Any => n :: flatten(lst.tail)
      }
    }
  }

  private def compress2(lst :List[Any], looking :Any): List[Any] = {
    if (lst.isEmpty){
      Nil
    }
    else{
      if (lst.head == looking){
	compress2(lst.tail, looking)
      }
      else{
	lst.head :: compress2(lst.tail, lst.head)
      }
    }
  }

  def compress(lst :List[Any]): List[Any] = lst.head :: compress2(lst, lst.head)


}
