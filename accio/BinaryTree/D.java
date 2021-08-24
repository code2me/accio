package accio.BinaryTree;

import java.util.*;
// https://www.hackerrank.com/challenges/tree-level-order-traversal/problem

class D {

    static void levelOrder(Node root) {
        Node node = root;
        LinkedList<Node> queue = new LinkedList<Node>();
        queue.add(node);
        while (queue.size() != 0) {
            int s = queue.poll().data;
            System.out.print(s + " ");

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }
            node = queue.peek();
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        levelOrder(root);
    }
}
