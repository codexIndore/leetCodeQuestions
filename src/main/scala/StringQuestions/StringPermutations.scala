package StringQuestions

import scala.collection.mutable.ListBuffer

class StringPermutations {
  def generate(src: String): List[String] = {
    val result = new ListBuffer[String]()
    permute(src.toCharArray, 0, result)
    result.toList
  }

  def permute(src: Array[Char], index: Int, result: ListBuffer[String]): Unit ={
    if(index == src.length -1){
      result += src.mkString("")
    }else{
      for(i <- index to src.length -1 ){
        //println("i =" + i)
        swap(src, index, i)
        permute(src, index+1, result)
        swap(src, index, i)
      }
    }

  }

  def swap(src: Array[Char], i: Int, j: Int): Unit = {
    val tmp = src(j)
    src(j)= src(i)
    src(i) = tmp
  }
}

object StringPermutations{
  def main(args: Array[String]): Unit = {
    val permutations = new StringPermutations
    val result = permutations.generate("123456")
    println(result.size)
    result.toList.foreach(row => println(row))
  }
}