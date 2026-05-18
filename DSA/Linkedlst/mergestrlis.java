public class mergestrlis {

    public static void main(String[] args) {
        Node n5 = new Node(50, null);
        Node n4 = new Node(40, n5);
        Node n3 = new Node(30, n4);
        Node n2 = new Node(20, n3);
        Node n1 = new Node(10, n2);
        Node m3 = new Node(35, null);
        Node m2 = new Node(25, m3);
        Node m1 = new Node(15, m2);
        Operations op = new Operations();
        System.out.println("List 1:");
        op.printList(n1);
        System.out.println("List 2:");
        op.printList(m1);
        Node mergedHead = op.merge(n1, m1);
        System.out.println("Merged List:");
        op.printList(mergedHead);
    }
}
class Operations {
    public void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.nxt;
        }
        System.out.println("null");
    }
    public Node merge(Node n1, Node m1) {
        Node dummy = new Node(0, null);
        Node tail = dummy;
        while (n1 != null && m1 != null) {
            if (n1.data < m1.data) {
                tail.nxt = n1;
                n1 = n1.nxt;
            } else {
                tail.nxt = m1;
                m1 = m1.nxt;
            }
            tail = tail.nxt;
        }
        // attach remaining nodes
        if (n1 != null) {
            tail.nxt = n1;
        }
        if (m1 != null) {
            tail.nxt = m1;
        }
        return dummy.nxt;
    }
}
class Node {

    int data;
    Node nxt;

    Node(int data, Node nxt) {
        this.data = data;
        this.nxt = nxt;
    }
}