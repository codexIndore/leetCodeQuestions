package StringQuestions

class ReverseStringWords {
  def reverse(src: String): String = {
    val words = src.split("\\.")
    val length = words.size
    for (i <- words.indices) {
      if (i < words.length / 2) {
        val temp = words(length - 1 - i)
        words(length - 1 - i) = words(i)
        words(i) = temp
      }
    }
    words.mkString(".")
  }
}

object ReverseStringWords {
  def main(args: Array[String]): Unit = {
    val reverseStringWords = new ReverseStringWords
    val output = reverseStringWords.reverse("abc.def.ghi.jkl.mno")
    println(output)
  }
}