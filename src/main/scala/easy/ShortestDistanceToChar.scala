package easy

import scala.collection.mutable.ListBuffer

object ShortestDistanceToChar {
  def main(args: Array[String]): Unit = {
    println(shortestToChar("loveleetcode", 'e').mkString(","))
  }

  def shortestToChar(S: String, C: Char): Array[Int] = {
    val charIndex = new ListBuffer[Int]()
    val distanceArray = Array.ofDim[Int](S.toCharArray.length)
    for( c <- S.zipWithIndex){
      if(C == c._1){
        charIndex += c._2
      }
    }
    for( c <- S.zipWithIndex){
      var distance = Int.MaxValue
      for( i <- charIndex.toList){
        if(Math.abs(i - c._2) < distance){
          distance = Math.abs(i - c._2)
        }
      }
      distanceArray(c._2) = distance
    }
    return distanceArray
  }

  def optimalSolution(S: String, C:Char): Array[Int] = {
    null
  }
}
