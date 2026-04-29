
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do { 
            n=sc.nextInt();
            System.out.println("User entered the number: "+n);
        } while (n!=0);

        int h=1;
        while(h!=0){
            h = sc.nextInt();
            System.out.println("User entered the number: "+h);
        }
        final int a=12;
        System.out.println(a);
        
    }
}
