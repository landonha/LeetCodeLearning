package helper;

import definition.ListNode;

public class ListNodeHelper {

  public static ListNode generateListNodesWithArray(int[] numbers) {
    ListNode result = new ListNode();
    ListNode dummyHead = result;
    for (int number : numbers) {
      dummyHead.next = new ListNode(number);
      dummyHead = dummyHead.next;
    }
    return result.next;
  }

  public static boolean compareTwoListNodes(ListNode actual, ListNode expected) {
    while (actual != null && expected != null) {
      if (actual.val != expected.val) {
        System.out.println(actual.val);
        System.out.println(expected.val);
        return false;
      }
      System.out.println(actual.val);
      System.out.println(expected.val);
      actual = actual.next;
      expected = expected.next;
    }
    return (actual == null) && (expected == null);
  }

}
