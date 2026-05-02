import java.util.Arrays;
public class Arrays1{
    public static void main(String args[]){
        int a[] = {1,2,3,4,5,6,7,8,9,0};
        int f[] = new int[10];
        int h[] = new int[10];
        System.out.print("These are the array elements: ");
        for(int i=0;i<10;i++){
            System.out.print(a[i]);
        }
        System.out.println();
        System.arraycopy(a, 0, f, 0, 5);
        System.out.println(Arrays.toString(f));
        h = Arrays.copyOf(a,3);
        System.out.println(Arrays.toString(h));
        int b[] = a.clone();//Source and Destinattion must be same length
        System.out.println(Arrays.toString(b));
        
    }

}
