public class Remove {
    public static void main(String[] args) {
        Node n5 = new Node(5,null);
        Node n4 = new Node(3,n5);
        Node n3 = new Node(3,n4);
        Node n2 = new Node(2,n3);
        Node n1 = new Node(1,n2);

        Node mn5 = new Node(5,null);
        Node mn4 = new Node(4,mn5);
        Node mn3 = new Node(3,mn4);
        Node mn2 = new Node(2,mn3);
        Node mn1 = new Node(1,mn2);

        NodePrint o = new NodePrint();
        System.out.println("Original List:");
        o.print(n1);
        Dup d = new Dup();
        Node res = d.removeDuplicates(n1);
        System.out.println("List after removing duplicates:");
        o.print(res);
        // Input: head = [1,2,6,3,4,5,6], val = 6
        Node res1 = d.removeval(mn1,1);
        System.out.println("List after removing value 6:");
        o.print(res1);

    }
}
class Dup{
    Node removeDuplicates(Node head){
        Node duplist = head;
        Node dup = duplist;
        // Node dup1 = duplist.next;
        while(dup != null && dup.next != null){
            if(dup.val == dup.next.val){
                dup.next = dup.next.next;
            }else{
                dup = dup.next;
            }
        }
        return head;
    }
    Node removeval(Node head, int val) {
    while (head != null && head.val == val) {
        head = head.next;
    }
    Node dup = head;
    while (dup != null && dup.next != null) {
        if (dup.next.val == val) {
            dup.next = dup.next.next;
        } else {
            dup = dup.next;
        }
    }
    return head;
}
}