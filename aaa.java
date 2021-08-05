/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {

    static int count = 0, num = 0;

    public static int addNum(ListNode head) {
        if (head == null) {
            return 0;
        }

        num += head.val * Math.pow(10, count);
        head = head.next;
        count++;

        addNum(head);

        return num;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int num1 = addNum(l1);
        num = 0;
        count = 0;
        int num2 = addNum(l2);

        int sum = num1 + num2;

        int temp;
        ListNode sumNode = new ListNode();
        ListNode head = sumNode;

        while (sum != 0) {
            temp = sum % 10;
            sumNode.val = temp;
            System.out.println(sumNode.val);
            sumNode = sumNode.next;
            sum = sum / 10;
        }

        sumNode.next = null;

        return head;
    }
}