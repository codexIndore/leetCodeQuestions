package easy

object ReverseInteger {
  def main(args: Array[String]): Unit = {
    println(Int.MaxValue)
    println(reverse(1534236469))
  }

  def reverse(x: Int): Int = {
    /**
      * number = 123
      * reverse = 321
      * 123/10 = 12
      * 123%10 = 3
      * number = number*10 + percentile
      * =0*10 + 3
      * = 3
      *
      * 3*10 + 2 = 32
      * 32*10 + 1
      * 321
      */
    var reversedNumber = 0
    var actualNumber = x

    while(actualNumber != 0){
      val remainder = actualNumber%10
      actualNumber = actualNumber/10
      if(reversedNumber*10 + remainder > Integer.MAX_VALUE){
        return 0
      }else{
        reversedNumber = reversedNumber * 10 + remainder
        println(reversedNumber)
      }
    }
    reversedNumber
  }
}
