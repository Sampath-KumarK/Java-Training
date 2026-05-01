// Task First Character Finder
// Requirement
// Write a program that takes a string as input and prints the first character of the
// string
import java.util.Scanner;
public class FirstCharFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        char firstChar = input.charAt(0);
        System.out.println(firstChar);
    }
}
