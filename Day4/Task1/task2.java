import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    if(n==0) {
        System.out.println("Zero");
    } else if(n>0) {
        System.out.println("Positive");
    } else {
        System.out.println("Negative");
    }
}
}