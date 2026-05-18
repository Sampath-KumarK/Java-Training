public class removenthnode {
    public static void main(String[] args) {
        Node n5 = new Node(50, null);
        Node n4 = new Node(40, n5);
        Node n3 = new Node(30, n4);
        Node n2 = new Node(20, n3);
        Node n1 = new Node(10, n2);
        Operations op = new Operations();
        System.out.println("Before Removal:");
        op.printList(n1);
        int N = 2; // remove 2nd node from end
        Node newHead = op.removeNthFromEnd(n1, N);
        System.out.println("After Removal:");
        op.printList(newHead);
    }
}
class Node{
    int data;
    Node nxt;
    Node(int data, Node nxt) {
        this.data = data;
        this.nxt = nxt;
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
    public Node removeNthFromEnd(Node head, int N) {
        Node dummy = new Node();
        
        return dummy.next;
    }
}