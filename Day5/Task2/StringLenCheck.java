// Task String Length Check
// Requirement
// Write a program that takes a string as input and checks its length
// If length is less than 5 print Short
// If length is 5 or more print Long
import java.util.Scanner;
public class StringLenCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int length = input.length();
        if (length < 5) {
            System.out.println("Short");
        } else {
            System.out.println("Long");
        }
    }
}
