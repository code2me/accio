package accio.week3;

// https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists/problem
import java.io.*;
import java.util.*;

public class B {

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

    public static void printSinglyLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    //my code
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1 == null) {
            return head2;
        } else if (head2 == null) {
            return head1;
        }

        /* Find new head pointer */
        SinglyLinkedListNode head = null;
        if (head1.data < head2.data) {
            head = head1;
            head1 = head1.next;
        } else {
            head = head2;
            head2 = head2.next;
        }

        /* Build rest of list */
        SinglyLinkedListNode n = head;
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                n.next = head1;
                head1 = head1.next;
            } else {
                n.next = head2;
                head2 = head2.next;
            }
            n = n.next;
        }

        /* Attach the remaining elements */
        if (head1 == null) {
            n.next = head2;
        } else {
            n.next = head1;
        }

        return head;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int tests = scanner.nextInt();

        for (int testsItr = 0; testsItr < tests; testsItr++) {

            //LinkedList 1
            SinglyLinkedList llist1 = new SinglyLinkedList();
            int llist1Count = scanner.nextInt();

            for (int i = 0; i < llist1Count; i++) {
                int llist1Item = scanner.nextInt();
                llist1.insertNode(llist1Item);
            }

            // LinkedList 2
            SinglyLinkedList llist2 = new SinglyLinkedList();
            int llist2Count = scanner.nextInt();

            for (int i = 0; i < llist2Count; i++) {
                int llist2Item = scanner.nextInt();
                llist2.insertNode(llist2Item);
            }

            // MergedLinkedList
            SinglyLinkedListNode llist3 = mergeLists(llist1.head, llist2.head);

            printSinglyLinkedList(llist3);
        }

        scanner.close();
    }
}
