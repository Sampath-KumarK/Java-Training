class Node{
    int data;
    Node next;
}

public class Main{
    public static void main(String[] args){

        Node first = new Node();
        first.data = 10;

        Node second = new Node();
        second.data = 20;

        Node third = new Node();
        third.data = 30;

        first.next = second;
        second.next = third;

        Node temp = first;

        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}