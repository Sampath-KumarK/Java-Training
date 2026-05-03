
import java.util.Arrays;

public class BookIDSort {
    public static void main(String[] args) {

        int[] bookIDs = { 305, 101, 450, 212, 378, 150 };

        System.out.println("Before sorting: " + Arrays.toString(bookIDs));

       
        Arrays.sort(bookIDs);

        
        System.out.println("After sorting:  " + Arrays.toString(bookIDs));

        System.out.println("\n--- Sorted Book IDs ---");
        for (int id : bookIDs) {
            System.out.println("Book ID: " + id);
        }
    }
}