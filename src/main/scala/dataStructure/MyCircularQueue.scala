package dataStructure


class MyCircularQueue(_k: Int) {

  /** Initialize your data structure here. Set the length of the queue to be k. */
  val queue = Array(_k)
  val length = _k
  var head = 0
  var tail = 0



  /** Insert an element into the circular queue. Return true if the operation is successful. */
  def enQueue(value: Int): Boolean = {
    println("enqueue")
    /**
      * Is queue Empty that mean head == tail, in that scenario increment tail
      */
    if (isEmpty()) {
      val index = if(head == length -1) Math.abs(length - (head + 1)) else head+1
      if(head == length){
        head = 0;
        tail = 0;
      }else{
        head = index
        tail = index
      }
      println("head = " + head + "  tail = " + tail)
      queue(head) = value
      return true
    } else if (isFull()) {
      /**
        * Is queue full, that would mean head + tail = length
        */
      return false
    } else {
      tail = if(tail == length -1) Math.abs(length - (tail + 1)) else tail+1
      println("head = " + head + "  tail = " + tail)
      queue(tail) = value
      return true
    }
  }

  /** Delete an element from the circular queue. Return true if the operation is successful. */
  def deQueue(): Boolean = {
    println("dequeue")
    if (isEmpty()) {
      return false
    } else {
      head = Math.abs(length - (head + 1))
      println("head = " + head + "  tail = " + tail)
      return true
    }
  }


  /** Get the front item from the queue. */
  def Front(): Int = {
    queue(head)
  }

  /** Get the last item from the queue. */
  def Rear(): Int = {
    queue(tail)
  }

  /** Checks whether the circular queue is empty or not. */
  def isEmpty(): Boolean = {
    println("Empty")
    head == tail
  }

  /** Checks whether the circular queue is full or not. */
  def isFull(): Boolean = {
    println("Full")
    head + tail == length
  }

}

/**
  * Your MyCircularQueue object will be instantiated and called as such:
  * var obj = new MyCircularQueue(k)
  * var param_1 = obj.enQueue(value)
  * var param_2 = obj.deQueue()
  * var param_3 = obj.Front()
  * var param_4 = obj.Rear()
  * var param_5 = obj.isEmpty()
  * var param_6 = obj.isFull()
  */