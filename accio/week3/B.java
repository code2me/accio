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

    // my code
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode h1, SinglyLinkedListNode h2) {
        SinglyLinkedListNode newHead = null;
        SinglyLinkedListNode temp = null;
        while (h1 != null && h2 != null) {
            if (h1.data < h2.data) {
                if (newHead == null) {
                    newHead = h1;
                    temp = h1;
                } else {
                    temp.next = h1;
                    temp = h1;
                }
                h1 = h1.next;
            } else {
                if (newHead == null) {
                    newHead = h2;
                    temp = h2;
                } else {
                    temp.next = h2;
                    temp = h2;
                }
                h2 = h2.next;
            }
        }

        if (h1 == null) {
            temp.next = h2;
        } else {
            temp.next = h1;
        }

        return newHead;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int tests = scanner.nextInt();

        for (int testsItr = 0; testsItr < tests; testsItr++) {

            // LinkedList 1
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
