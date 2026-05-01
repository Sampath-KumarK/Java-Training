public class CallByRef {
    public static void main(String args[]){
        dummy dm = new dummy();
        dm.add(dm);
    }
}

class dummy{
    int a = 10;

    public static void add(dummy h){
        System.out.println(h.a);
    }
}