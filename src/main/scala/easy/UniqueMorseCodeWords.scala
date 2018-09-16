package easy

import scala.collection.mutable.ListBuffer

/**
  * LeetCode: https://leetcode.com/problems/unique-morse-code-words/description/
  * International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.
  *
  * For convenience, the full table for the 26 letters of the English alphabet is given below:
  *
  * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
  * Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cab" can be written as "-.-.-....-", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.
  *
  * Return the number of different transformations among all words we have.
  *
  * Example:
  * Input: words = ["gin", "zen", "gig", "msg"]
  * Output: 2
  * Explanation:
  * The transformation of each word is:
  * "gin" -> "--...-."
  * "zen" -> "--...-."
  * "gig" -> "--...--."
  * "msg" -> "--...--."
  *
  * There are 2 different transformations, "--...-." and "--...--.".
  *
  *
  * Note:
  *
  * The length of words will be at most 100.
  * Each words[i] will have length in range [1, 12].
  * words[i] will only consist of lowercase letters.
  */
object UniqueMorseCodeWords {
  def main(args: Array[String]): Unit = {
    val transformationsArray = Array(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
      ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..")
    val charTransformationMap = scala.collection.mutable.Map[Char, String]()
    var index = 97
    for (transformation <- transformationsArray) {
      charTransformationMap += index.toChar -> transformation
      index += 1
    }
    println(getUniqueTransformationsCount(args, charTransformationMap))

  }

  def getUniqueTransformationsCount(words: Array[String],
                                    charTransformationMap: scala.collection.mutable.Map[Char, String]): Int = {
    var wordCodes = scala.collection.mutable.ListBuffer[String]()
    for (word <- words) {
      var code = ListBuffer[String]()
      for (char <- word.toList) {
        code += charTransformationMap(char)
      }
      wordCodes += code.mkString("")
    }
    wordCodes.distinct.length
  }
}
