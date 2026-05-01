// Requirement
// Write a program that takes a string as input and checks whether it starts with Java
// If it starts with Java print Yes otherwise print No
// sk2;
import java.util.Scanner;
public class StrStartWtJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        if (input.startsWith("Java")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
