class Main{
    public static void main(String args[]){
        NodePrint o = new NodePrint();

        Node n5 = new Node(50,null);
        Node n4 = new Node(40,n5);
        Node n3 = new Node(30,n4);
        Node n2 = new Node(20,n3);
        Node n1 = new Node(10,n2);
        System.out.print("These are the node Elements: ");
        o.print(n1);
        Node res = o.reverse(n1);
        System.out.print("These are the node Reversed Elements: ");
        o.print(res);
        Node ans = o.rangereverse(res,2,4);
        System.out.print("Range Reverse: ");
        o.print(ans);
        Node m5 = new Node(45,null);
        Node m4 = new Node(28,m5);
        Node m3 = new Node(26,m4);
        Node m2 = new Node(25,m3);
        Node m1 = new Node(15,m2);

        Node mn5 = new Node(50,null);
        Node mn4 = new Node(40,mn5);
        Node mn3 = new Node(30,mn4);
        Node mn2 = new Node(20,mn3);
        Node mn1 = new Node(10,mn2);

        System.out.println("Merged List:");

        Operations op = new Operations();

        Node mergedlist = op.merge(mn1,m1);

        o.print(mergedlist);
        
    }
}

class NodePrint{
    void print(Node n){
        for(Node temp=n;temp!=null;temp=temp.next){
            System.out.print(temp.val+" ");
        }
        System.out.println();
    }

    Node reverse(Node head){
        Node cur = head;
        Node pre = null;
        Node next;

        while(cur!=null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        return pre;
    }

    Node rangereverse(Node n,int left,int right){
        if(n==null || left==right){
            return n;
        }

        Node dummy = new Node(0,null);
        dummy.next = n;

        Node prelis = dummy;

        for(int i=1;i<left;i++){
            prelis = prelis.next;
        }

        Node current = prelis.next;
        Node pre = null;
        Node next = null;

        for(int i=0;i<right-left+1;i++){
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }

        Node subcur = prelis.next;

        prelis.next = pre;
        subcur.next = current;

        return dummy.next;
    }
}

class Operations{
    Node merge(Node h1,Node h2){
        Node dummy = new Node(0,null);
        Node tail = dummy;
        while(h1!=null && h2!=null){
            if(h1.val<=h2.val){
                tail.next = h1;
                h1 = h1.next;
            }
            else{
                tail.next = h2;
                h2 = h2.next;
            }
            tail = tail.next;
        }
        if(h1!=null){
            tail.next = h1;
        }
        if(h2!=null){
            tail.next = h2;
        }
        return dummy.next;
    }

}
class Node{
    int val;
    Node next;
    Node(int data,Node next){
        this.val = data;
        this.next = next;
    }
    Node(){
    }
}