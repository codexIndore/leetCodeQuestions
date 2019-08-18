package arrays

class TwoSum {
  def getSum(nums: Array[Int], target: Int): Array[Int] = {
    val output = new Array[Int](_length = 2)
    if(nums.length < 2){
      return output
    }
    for(i <- 0 to nums.length-1){
      for(j <- (i+1) to nums.length-1){
        if(nums(i) + nums(j) == target){
          output(0) = nums(i)
          output(1) = nums(j)
          return output
        }
      }
    }
    output
  }
}

object TwoSum{
  def main(args: Array[String]): Unit = {
    val example = Array(1,5,7,3,4)
    val twoSum = new TwoSum
    print(twoSum.getSum(example, 9).mkString(","))
  }
}
