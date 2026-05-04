//  Task 3: Random – Lucky Draw Winner
//  Scenario:
//  A shop conducts a lucky draw to select a winner randomly.
//  Task:
// ●	Customers = { "Arun", "Bala", "Cathy", "Divya", "Eshan" }
//  Use Random class to:
// 1.	Pick one random customer
// 2.	Display: "Winner is: <name>"
// Expected Output (example):
//  Winner is: Divya
import java.util.Random;
public class RandomLuckyWinner {
    public static void main(String[] args) {
        String cus[] = {"Arun", "Bala", "Cathy", "Divya", "Eshan"};
        Random r = new Random();
        int index = r.nextInt(cus.length);
        System.out.println("Winner is: " + cus[index]);
    }
}
