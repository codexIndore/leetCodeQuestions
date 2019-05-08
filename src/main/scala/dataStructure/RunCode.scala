package dataStructure

object RunCode {
  def main(args: Array[String]): Unit = {
    /**
      * ["MyCircularQueue","enQueue","enQueue","enQueue","enQueue","Rear","isFull","deQueue","enQueue","Rear"]
      * [[3],[1],[2],[3],[4],[],[],[],[4],[]]
      */
    var obj = new MyCircularQueue(3)
    println(obj.enQueue(1))
    println(obj.enQueue(2))
    println(obj.enQueue(3))
    println(obj.enQueue(4))
    println(obj.Rear())
    println(obj.isFull())
    println(obj.deQueue())
    println(obj.enQueue(4))
    println(obj.Rear())
  }
}
