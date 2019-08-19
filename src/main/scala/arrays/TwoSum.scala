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

  /**
   * Use the hash table to figure out the indexes of numbers that adds up to the target
   * @param nums
   * @param target
   * @return
   */
  def getSumWithMap(nums: Array[Int], target: Int): Array[Int] = {
    val numsMap = scala.collection.mutable.HashMap[Int, Int]()
    for((num, index) <- nums.zipWithIndex){
      val complement = target - num
      if(numsMap.contains(complement)){
        return Array(index, numsMap.get(complement).get)
      }else{
        numsMap += (num -> index)
      }
    }
    throw new IllegalStateException("no two numbers present that can add up to target:" + target)
  }
}

object TwoSum{
  def main(args: Array[String]): Unit = {
    val example = Array(1,5,7,3,4)
    val twoSum = new TwoSum
    print(twoSum.getSumWithMap(example, 9).mkString(","))
  }
}
