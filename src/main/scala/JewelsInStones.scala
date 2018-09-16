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
