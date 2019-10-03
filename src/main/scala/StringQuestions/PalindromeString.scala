package StringQuestions

class PalindromeString {
  def check(src: String): Boolean = {
    val length = src.toCharArray.length
    for(i <- 0  until (src.toCharArray.length/2) ){
      if(src.charAt(i) != src.charAt(length - 1 -i)){
        return false
      }
    }
    true
  }
}

object PalindromeString {
  def main(args: Array[String]): Unit = {
    val palindromeString = new PalindromeString
    println(palindromeString.check("ABCBA"))
  }
}
