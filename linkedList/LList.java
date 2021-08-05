package linkedList;

// Linked list implementation in Java

public class LList {
    // Creating a node
    Node head;

    public static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // public static void printList(Node head) {
    //     while (head != null) {
    //         System.out.print(head.data + " ");
    //         head = head.next;
    //     }
    // }

    public static void main(String[] args) {
        LList llist = new LList();

        // Assign data 
        llist.head = new Node(2);
        Node second = new Node(4);
        Node third = new Node(3);

        // Connect nodes
        llist.head.next = second;
        second.next = third;

        // printing node-data
        addNum(llist.head);
        System.out.println(num);
    }

    static int count = 0, num = 0;

    public static int addNum(Node head) {
        if (head == null) {
            return 0;
        }

        num += head.data * Math.pow(10, count);
        head = head.next;
        count++;
        
        addNum(head);

        return num;
    }
}
