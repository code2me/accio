package accio.week2;

import java.util.*;

// https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list/problem
public class D {

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

    
    public static void printSinglyLinkedList(SinglyLinkedListNode llist) {
        SinglyLinkedListNode currNode = llist;

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }

    // My code
    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        int count = 0;
        if (llist == null) {
            return llist;
        }

        if (position == 0) {
            return llist.next;
        }
        

        SinglyLinkedListNode current = llist;
        while (current.next != null) {
            if (count == position - 1) {
                SinglyLinkedListNode temp = current.next.next;
                current.next = temp;
                break;
            }
            current = current.next;
            count++;
        }
        return llist;
    }

    public static void main(String[] args) {

        SinglyLinkedList llist = new SinglyLinkedList();
        Scanner sc = new Scanner(System.in);
        int llistCount = sc.nextInt();

        for (int i = 0; i < llistCount; i++) {

            int llistItem = sc.nextInt();
            llist.insertNode(llistItem);
        }

        int position = sc.nextInt();

        SinglyLinkedListNode llist1 = deleteNode(llist.head, position);

        printSinglyLinkedList(llist1);

        sc.close();
    }
}
