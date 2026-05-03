import java.util.Arrays;

public class ArrayCopyMethods {
    public static void main(String[] args) {

        int[] original = { 10, 20, 30, 40, 50 };
        System.out.println("Original:          " + Arrays.toString(original));

        
        int[] copy1 = original.clone();
        System.out.println("clone():           " + Arrays.toString(copy1));

       
        int[] copy2 = Arrays.copyOf(original, original.length);
        System.out.println("Arrays.copyOf():   " + Arrays.toString(copy2));

        
        int[] copy3 = new int[original.length];
        System.arraycopy(original, 0, copy3, 0, original.length);
        System.out.println("System.arraycopy():" + Arrays.toString(copy3));
    }
}