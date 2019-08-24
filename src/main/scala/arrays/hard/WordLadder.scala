package arrays.hard

import scala.collection.mutable.ListBuffer

class WordLadder {
  def findLadders(beginWord: String, endWord: String, wordList: List[String]): List[List[String]] = {
    val adjacentWords = getAdjacentWords(beginWord, wordList)
    val output = ListBuffer[List[String]]()
    if (adjacentWords.contains(endWord)) {
      output += List(beginWord) ++ adjacentWords
    }else{
      for(word <- adjacentWords){
        val adjacentWords = getAdjacentWords(beginWord, wordList)
        val output = ListBuffer[List[String]]()
        if (adjacentWords.contains(endWord)) {
          output += List(beginWord) ++ adjacentWords
        }
      }

    }
    output.toList
  }

  def getAdjacentWords(begingWord: String, wordList: List[String]): List[String] = {
    val adjacentWords =  new ListBuffer[String]()
    for (word <- wordList) {
      var count = 0

      for (x <- begingWord.toCharArray.zipWithIndex) {
        if (x._1 == word.charAt(x._2) && count < 1) {
          count += 1
        }
      }
      if (count == 1) {
        adjacentWords += word
      }

    }
    adjacentWords.toList
  }
}

object WordLadder {
  def main(args: Array[String]): Unit = {
    /**
     * beginWord = "hit",
     * endWord = "cog",
     * wordList = ["hot","dot","dog","lot","log","cog"]
     */
    val wordLadder = new WordLadder
    println(wordLadder.findLadders("cit", "cog", List("cot", "cog")).mkString(","))
  }
}
