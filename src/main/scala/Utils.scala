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

  def pack2(lst :List[Symbol], looking :Symbol, ans :List[Symbol]) :List[List[Symbol]] = {
    if(lst.isEmpty){
      return List(ans)
    }
    else{
      if (lst.head == looking){
	pack2(lst.tail, looking, looking :: ans)
      }
      else{
	ans :: pack2(lst.tail, lst.head, List(lst.head))
      }
    }
  }
  
  def pack(lst :List[Symbol]) :List[List[Symbol]] = pack2(lst.tail, lst.head, List(lst.head))

  def encode(lst :List[Symbol]) = pack(lst).map(l => (l.length, l.head))

private def tmp(p :(Int, Symbol)) = {
if (p._1 == 1){
p._2
}
else{
p
}
}
  def encodeModified(lst :List[Symbol]) = encode(lst).map(p => tmp(p))
}
