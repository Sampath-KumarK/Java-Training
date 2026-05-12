class middleelement{
    public static void main(String args[]){
        Node n1= new Node(10);
        Node n2= new Node(20);  
        Node n3= new Node(30);
        Node n4= new Node(40);
        Node n5 = new Node(50);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        Node temp = n1;
        Node temp1 = n1;
        while(temp!=null && temp.next!=null){   
            temp = temp.next;
            temp = temp.next;
            temp1 = temp1.next;
        }
                System.out.println(temp1.val);            
    }
}
class Node{
    int val;
    Node next;
    Node(int data){
        val = data;
        next = null;
    }
}