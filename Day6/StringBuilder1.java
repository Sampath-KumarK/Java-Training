public class StringBuilder1 {
public static void main(String[] a){
    StringBuilder sb = new StringBuilder("Hello");
    System.out.println(sb);
    sb.append(" World");
    System.out.println(sb);
    sb.insert(5, ",");
    System.out.println(sb);
    sb.delete(5, 6);
    System.out.println(sb);
    sb.reverse();
    System.out.println(sb);
    sb.replace(0, 5, "Hi");
    System.out.println(sb);
    System.out.println(sb.charAt(0));
    StringBuilder sb1 = new StringBuilder("  Hello   ");
    System.out.println(sb1.capacity());
    sb1.trimToSize();
    System.out.println(sb1.capacity());
    System.out.println(sb1);

}
}
