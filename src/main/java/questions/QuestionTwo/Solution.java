package questions.QuestionTwo;

import definition.ListNode;

public class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode resultListNode = new ListNode();
    ListNode dummyHead = resultListNode;
    int remainder = 0;

    while (l1 != null || l2 != null) {
      int firstNumber = (l1 == null) ? 0 : l1.val;
      int secondNumber = (l2 == null) ? 0 : l2.val;

      int currentSum = (firstNumber + secondNumber + remainder) % 10;
      dummyHead.next = new ListNode(currentSum);

      dummyHead = dummyHead.next;
      l1 = (l1 == null) ? null : l1.next;
      l2 = (l2 == null) ? null : l2.next;
      remainder = (firstNumber + secondNumber + remainder) / 10;
    }

    dummyHead.next = (remainder == 0) ? null : new ListNode(remainder);
    return resultListNode.next;
  }
}
