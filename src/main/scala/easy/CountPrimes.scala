package easy

object CountPrimes {
  def main(args: Array[String]): Unit = {
    println(countPrimes(10))
  }

  def countPrimes(n: Int): Int = {
    for( i <- 1 to n){
      println(i)
    }
    return 0
  }
}
