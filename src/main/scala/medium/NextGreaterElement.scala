package medium

/**
  * LeetCode: https://leetcode.com/problems/next-greater-element-i/description/
  * You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2. Find all the next greater numbers for nums1's elements in the corresponding places of nums2.
  *
  * The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. If it does not exist, output -1 for this number.
  *
  * Example 1:
  * Input: nums1 = [4,1,2], nums2 = [1,3,4,2].
  * Output: [-1,3,-1]
  * Explanation:
  * For number 4 in the first array, you cannot find the next greater number for it in the second array, so output -1.
  * For number 1 in the first array, the next greater number for it in the second array is 3.
  * For number 2 in the first array, there is no next greater number for it in the second array, so output -1.
  * Example 2:
  * Input: nums1 = [2,4], nums2 = [1,2,3,4].
  * Output: [3,-1]
  * Explanation:
  * For number 2 in the first array, the next greater number for it in the second array is 3.
  * For number 4 in the first array, there is no next greater number for it in the second array, so output -1.
  * Note:
  * All elements in nums1 and nums2 are unique.
  * The length of both nums1 and nums2 would not exceed 1000.
  */
object NextGreaterElement {
  def main(args: Array[String]): Unit = {
    nextGreaterElement(Array(4,5), Array(4,5,25)).foreach(println(_))
    nextGreaterElement(Array(4,5), Array()).foreach(println(_))

  }

  def nextGreaterElement(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
    if(nums2.length > 0){
      val elementStack = scala.collection.mutable.Stack[Int]()
      var nextGreaterElementMap = Map[Int,Int]()
      elementStack.push(nums2(0))
      for(i <-1 to nums2.length-1){
        val next = nums2(i)
        while(!elementStack.isEmpty && elementStack.top < next){
          val top = elementStack.pop()
          if(next > top){
            nextGreaterElementMap += top -> next
          }
        }
        elementStack.push(next)
      }
      while(!elementStack.isEmpty){
        nextGreaterElementMap += elementStack.pop() -> -1
      }
      val output = new Array[Int](nums1.length)
      for(num <- nums1.zipWithIndex){
        output(num._2) = nextGreaterElementMap(num._1)
      }
      output
    }else{
      Array.fill(nums1.length){-1}
    }

  }
}
