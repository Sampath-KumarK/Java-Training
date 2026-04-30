import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        int mark;
        Scanner sc = new Scanner(System.in);
        mark = sc.nextInt();
        if(mark>=40){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}