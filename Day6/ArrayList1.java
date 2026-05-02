import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(7);
        list.add(17);
        list.add(11);
        list.add(10);
        list.add(3);
        System.out.println(list);
        list.set(2,111);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        ArrayList<String> s = new ArrayList<>();
        s.add("Sampath");
        s.add("Kumar");
        s.add("ECE");
        s.set(2,"Ece");
        System.out.println(s);
        list.contains(17);
        System.out.println(list.contains(17));
        list.sort(null);
        System.out.println(list);
        


    }
}
