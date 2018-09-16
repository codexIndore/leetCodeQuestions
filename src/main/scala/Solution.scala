object Solution {

  def main(args: Array[String]): Unit = {
    val sol = twoSum(Array(1,2,3), 3)
    println(sol.mkString("-"))
  }
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {

    var numsSet = scala.collection.mutable.Map[Int, Int]()
    for((num, index) <- nums.zipWithIndex){
      numsSet += (num -> index)
    }
    for((number,index) <- nums.zipWithIndex){
      if(numsSet.keySet.contains(target - number)){
        return Array(index, numsSet(target - number))
      }
    }
    return Array(0,0)
  }
}