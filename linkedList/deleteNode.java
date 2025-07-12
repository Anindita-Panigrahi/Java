class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class deleteNode {

    // Deletes a given node (not the last node) by copying next node's data
    public static void deleteGivenNode(Node node) {
        if (node == null || node.next == null) return;
        node.data = node.next.data;
        node.next = node.next.next;
    }

    // Deletes the tail node
    public static Node deleteTail(Node head) {
        if (head == null || head.next == null)
            return null;

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    // Print linked list
    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a linked list: 2 → 5 → 8 → 7
        Node head = new Node(2);
        head.next = new Node(5);
        head.next.next = new Node(8);
        head.next.next.next = new Node(7);

        System.out.print("Original list: ");
        printLL(head);

        // Delete the tail
        head = deleteTail(head);
        System.out.print("After deleting tail: ");
        printLL(head);

        // Delete a middle node (simulate deleting node with value 5)
        deleteGivenNode(head.next); // head.next is node with value 5
        System.out.print("After deleting a given node: ");
        printLL(head);
    }
}
