object IslandParameter {
  def main(args: Array[String]): Unit = {
    val grid = Array(Array(0, 1, 0, 0), Array(1, 1, 1, 0), Array(0, 1, 0, 0), Array(1, 1, 0, 0))
    println(islandPerimeter(grid))
  }

  def islandPerimeter(grid: Array[Array[Int]]): Int = {
    var numIslands = 0
    var numNeighbours = 0
    for (i <- 0 until grid.length) {
      for (j <- 0 until grid(i).length) {
        if (grid(i)(j) == 1) {
          numIslands += 1
          if (j <= grid(i).length - 2) {
            if (grid(i)(j + 1) == 1) {
              numNeighbours += 1
            }
          }
          if(i <= grid.length -2){
            if(grid(i+1)(j) == 1){
              numNeighbours += 1
            }
          }
        }
      }
    }
    println("numIslands = " + numIslands + " numNeighbours = " + numNeighbours)
    numIslands * 4 - (numNeighbours * 2)
  }
}
