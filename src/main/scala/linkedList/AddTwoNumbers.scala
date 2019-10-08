package linkedList

class AddTwoNumbers {
    def addTwoNumbers(l11: ListNode, l12: ListNode): ListNode = {
      var result:ListNode = null
      var carry = 0
      var l1 = l11
      var l2 = l12
      while(l1.next != null && l2.next != null){
        if(result == null){
          val output = getSumNode(l1.x, l2.x, carry)
          result = output._1
          carry = output._2
        }else{
          val output  = getSumNode(l1.x, l2.x, carry)
          result.next = output._1
          carry = output._2
        }
        result = result.next
        l1 = l1.next
        l2 = l2.next
      }
      if(l1.next == null){
        while(l2.next != null){
          result.next = l2
          l2 = l2.next
        }
      }
      if(l2.next == null){
        while(l1.next != null){
          result.next = l1
          l1 = l1.next
        }
      }
      result
    }

  def getSumNode(l1:Int, l2:Int, carry:Int): (ListNode, Int) = {
    val sum = l1 + l2 + carry
    val carryOver = sum/10
    val result = new ListNode(sum%10)
    (result, carryOver)
  }

    def reverse(l1: ListNode): ListNode = {
      var revereList = l1
      var previous:ListNode = null
      while(revereList.next != null){
        val next = revereList.next
        revereList.next = previous
        previous = revereList
        revereList = next
      }
      revereList.next = previous
      revereList
    }

    def printList(l1: ListNode): Unit ={
      var value=l1
      while(value.next !=null){
        print(value.x + "->")
        value = value.next
      }
      print(value.x)

    }



}

object AddTwoNumbers {
  def main(args: Array[String]): Unit = {
    //val result = addTwoNumbers(new ListNode(1), new ListNode(2))
    val start = new ListNode(1)
    start.next = new ListNode(2)
    start.next.next = new ListNode(3)
    val addTwoNumbers = new AddTwoNumbers
    addTwoNumbers.printList(addTwoNumbers.addTwoNumbers(addTwoNumbers.reverse(start), addTwoNumbers.reverse(start)))
  }
}