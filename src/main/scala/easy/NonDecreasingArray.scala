package easy

/**
  * 665. Non-decreasing Array
  * Easy
  *
  * 984
  *
  * 204
  *
  * Favorite
  *
  * Share
  * Given an array with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.
  *
  * We define an array is non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n).
  *
  * Example 1:
  * Input: [4,2,3]
  * Output: True
  * Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
  * Example 2:
  * Input: [4,2,1]
  * Output: False
  * Explanation: You can't get a non-decreasing array by modify at most one element.
  */
object NonDecreasingArray {
  def main(args: Array[String]): Unit = {
    println(checkPossibility(Array(2,3,3,2,4)))
  }
  def checkPossibility(nums: Array[Int]): Boolean = {
    var nonIncreasingElements:Int = 0
    var nonIncreasingElementIndex:Int = 0
    val size =nums.size
    for((num,index) <- nums.zipWithIndex){
      if((index < size-1) && (num > nums(index+1))){
        nonIncreasingElements = nonIncreasingElements + 1
        nonIncreasingElementIndex = index
      }
      if(nonIncreasingElements >= 2){
        return false
      }
    }

    if(nonIncreasingElements == 1 && (nonIncreasingElementIndex > 0 && nonIncreasingElementIndex < (size -1))){
      if(nums(nonIncreasingElementIndex -1) > nums(nonIncreasingElementIndex + 1)){
        return false
      }
    }
    true
  }
}
