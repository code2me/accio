package accio.week2;

import java.util.*;

// www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem
public class F {

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
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        node.next = null;
        node.data = data;

        if (position == 0) {
            head = node;
        } 
        else {
            SinglyLinkedListNode temp = head;
            for (int i = 0; i < position - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SinglyLinkedList llist = new SinglyLinkedList();
        int llistCount = sc.nextInt();
        for (int i = 0; i < llistCount; i++) {
            int llistItem = sc.nextInt();
            llist.insertNode(llistItem);
        }

        int data = sc.nextInt();
        int position = sc.nextInt();

        SinglyLinkedListNode llist_head = insertNodeAtPosition(llist.head, data, position);
        printSinglyLinkedList(llist_head);

        sc.close();
    }
}
