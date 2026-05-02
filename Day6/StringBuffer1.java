// append(String s) → adds text at the end
// insert(int index, String s) → inserts text at a position
// replace(int start, int end, String s) → replaces part of string
// delete(int start, int end) → removes characters
// deleteCharAt(int index) → deletes a single character
// reverse() → reverses the string
// toString() → converts to String

public class StringBuffer1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        System.out.println(sb);
        sb.append(" World");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.delete(0, 5);
        
    }
}
