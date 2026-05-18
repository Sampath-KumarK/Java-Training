public class reverselst {
    public static void main(String[] args) {
        Node n5 = new Node(50, null);
        Node n4 = new Node(40, n5);
        Node n3 = new Node(30, n4);
        Node n2 = new Node(20, n3);
        Node n1 = new Node(10, n2);
        Operations op = new Operations();
        System.out.println("Before Reverse:");
        op.printList(n1);
        Node newHead = op.reverse(n1);
        System.out.println("After Reverse:");
        op.printList(newHead);
    }
}
class Operations {
    public Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            // store next node
            next = current.next;
            // reverse link
            current.next = prev;
            // move pointers
            prev = current;
            current = next;
            
        }
        return prev;
    }
    public void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
class Node {
    int data;
    Node next;
    Node(int data, Node n) {
        this.data = data;
        this.next = n;
    }
}