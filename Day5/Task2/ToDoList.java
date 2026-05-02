// Task: To-Do List
// Scenario:
// A user wants to manage daily tasks.
// Your program should:
// 1. Take 3 tasks as input
// 2. Store them
// 3. Display all task
// Input Example:
// Enter task 1: Study Java
// Enter task 2: Do homework
// Enter task 3: Go for walk
// Output:
// Your To-Do List:
// 1. Study Java
// 2. Do homework
// 3. Go for walk
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tasks = new String[3];
        for(int i = 0; i < 3; i++) {
            System.out.print("Enter task " + (i + 1) + ": ");
            tasks[i] = sc.nextLine();
        }
        System.out.println("\nYour To-Do List:");
        for(int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + tasks[i]);
        }
        sc.close();
    }
}
