package easy

object ReverseString {
  def main(args: Array[String]): Unit = {
    reverseString(Array('h','e','l','l','o','m'))
  }

  def reverseString(s: Array[Char]): Unit = {
    if(!s.isEmpty){
      val centre = s.length/2 -1
      println(centre)
      for( i <- 0 to centre){
        val originalChar = s(i)
        s(i) = s(s.length - 1 - i)
        s(s.length-1-i) = originalChar
      }
    }

  }
}
