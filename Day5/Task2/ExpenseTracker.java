// Task: Category-Based Expense Tracker
// A user spends money on different categories like Food, Travel, Shopping.
// Your program should:
// 1. Ask the user to enter expense amount and category
// 2. Store them
// 3. Calculate total expense
// 4. Calculate total spent on Food only
// 5. Display all expenses with categories

import java.util.Scanner;

public class ExpenseTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] amount = new double[5];
        String[] category = new String[5];
        double total = 0;
        double foodTotal = 0;
        for(int i = 0; i < 5; i++) {
            System.out.print("Enter expense amount: ");
            amount[i] = sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter category (Food/Travel/Shopping): ");
            category[i] = sc.nextLine();
            total += amount[i];
            if(category[i].equalsIgnoreCase("Food")) {
                foodTotal += amount[i];
            }
        }
        System.out.println("\nAll Expenses:");
        for(int i = 0; i < 5; i++) {
            System.out.println(category[i] + " - " + amount[i]);
        }
        System.out.println("\nTotal Expense: " + total);
        System.out.println("Total Food Expense: " + foodTotal);
        sc.close();
    }
}