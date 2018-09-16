package easy

import scala.collection.mutable.ListBuffer

/**
  * LeetCode: https://leetcode.com/problems/to-lower-case/description/
  * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
  *
  *
  *
  * Example 1:
  *
  * Input: "Hello"
  * Output: "hello"
  * Example 2:
  *
  * Input: "here"
  * Output: "here"
  * Example 3:
  *
  * Input: "LOVELY"
  * Output: "lovely"
  */
object ToLowerCase {
  def main(args: Array[String]): Unit = {
    println(toLowerCase("ABCD1234 $efg"))
  }

  def toLowerCase(arg: String): String = {
    var output = new ListBuffer[Char]()
    for(char <- arg.toList){
      if(char.toInt >= 64 && char.toInt <= 90){
        output += (char.toInt + 32).toChar
      }else{
        output += char
      }
    }
    return new String(output.toArray)
  }
}
