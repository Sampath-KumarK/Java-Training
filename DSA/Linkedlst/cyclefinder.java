public class cyclefinder {
    public static void main(String args[]){
        ListNode l1 =new ListNode();
        ListNode l2 =new ListNode();
        ListNode l3 =new ListNode();
        ListNode l4 =new ListNode();
        ListNode l5 =new ListNode();
        ListNode l6 =new ListNode();
        l1.data = 10;
        l2.data = 20;
        l3.data = 30;
        l4.data = 40;
        l5.data = 50;
        l6.data = 60;
        l1.next = l2;
        l2.next = l3;
        l3.next= l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l4;
        ListNode temp = l1;
        ListNode temp1 = l1;
        // temp1 = temp1.next;

        while(temp != null){

            temp = temp.next.next;
            temp1 = temp1.next;
                        if(temp1.data == temp.data){
                System.out.println(temp.data);
                break;
            }
        }
        
    }
}
class ListNode{
    int data;
    ListNode next;
}