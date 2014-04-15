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





}
