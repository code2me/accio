package accio.week2;

import java.util.*;

public class E {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    /* Print LinkedList
    public static void printSinglyLinkedList(SinglyLinkedListNode llist) {
        SinglyLinkedListNode currNode = llist;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
     }
     */
     

    // Recursively compare both lists
    static int compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1 == null && head2 == null)
            return 1;
        if (head1 == null || head2 == null)
            return 0;
        if (head1.data == head2.data)
            return compareLists(head1.next, head2.next);
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int j;

            // LinkedList 1
            SinglyLinkedList llist1 = new SinglyLinkedList();
            int llistCount1 = sc.nextInt();
            for (j = 0; j < llistCount1; j++) {

                int llistItem1 = sc.nextInt();
                llist1.insertNode(llistItem1);
            }

            // LinkedList 2
            SinglyLinkedList llist2 = new SinglyLinkedList();
            int llistCount2 = sc.nextInt();
            for (j = 0; j < llistCount2; j++) {

                int llistItem2 = sc.nextInt();
                llist2.insertNode(llistItem2);
            }

            int result = compareLists(llist1.head, llist2.head);
            System.out.println(result);
        }
        sc.close();
    }
}