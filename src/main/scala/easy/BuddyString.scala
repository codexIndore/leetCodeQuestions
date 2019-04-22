package easy

object BuddyString {
  def main(args: Array[String]): Unit = {
    println(buddyStrings("aa", "aa"))
  }
  def buddyStrings(A: String, B: String): Boolean = {
    if(A.equalsIgnoreCase(B)){
      return true
    }else{
      /**
        * if the string differs in more then two characters then it won't match
        */
      if(A.length != B.length){
        return false
      }else{
        var unmatchedCharCount = 0
        var unmatchedIndex:List[Int] = List[Int]()
        for( (a,i) <- A.zipWithIndex){
          if(a != B.charAt(i)){
           unmatchedCharCount = unmatchedCharCount +1
          }
        }
        if(unmatchedCharCount >2){
          return false
        }else{

        }
      }
      return  false
    }
  }
}
