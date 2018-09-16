package easy

/**
  * LeetCode Link:https://leetcode.com/problems/jewels-and-stones/description/
  * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
  *
  * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
  *
  * Example 1:
  *
  * Input: J = "aA", S = "aAAbbbb"
  * Output: 3
  * Example 2:
  *
  * Input: J = "z", S = "ZZ"
  * Output: 0
  */
object JewelsInStones {
  def main(args: Array[String]): Unit = {
    val numJewels = numJewelsInStones(args(0), args(1))
    print(numJewels)
  }

  def numJewelsInStones(jewels:String, stones:String): Int = {
    val jewelStones = jewels.toList.toSet
    var numJewels = 0
    for(stone <- stones.toList){
      if(jewelStones.contains(stone)){
        numJewels += 1
      }
    }
    return numJewels
  }
}
