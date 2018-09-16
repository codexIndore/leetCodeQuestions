package easy

import scala.collection.mutable.ListBuffer

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
