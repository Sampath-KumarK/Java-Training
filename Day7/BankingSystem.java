import java.util.Scanner;
public class BankingSystem {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int atmppin = 2005;
        Sample s = new Sample();

        System.out.println("Welcome to the Banking System!");
        System.out.println("Enter Your Atm Pin: ");
        int atmpin = sc.nextInt();

        if(atmpin == atmppin){
            System.out.println("Welcome to your account!");

            boolean repeat = true;

            while(repeat){
                System.out.println("\nPress 1 to check balance");
                System.out.println("Press 2 to deposit money");
                System.out.println("Press 3 to withdraw money");
                System.out.println("Press 4 to exit");

                int choice = sc.nextInt();

                if(choice == 1){
                    s.checkBalance();
                }
                else if(choice == 2){
                    System.out.println("Enter the amount to deposit: ");
                    int amount = sc.nextInt();
                    s.deposit(amount);
                }
                else if(choice == 3){
                    System.out.println("Enter the amount to withdraw: ");
                    int amount = sc.nextInt();
                    s.withdraw(amount);
                }
                else if(choice == 4){
                    System.out.println("Thank you!");
                    repeat = false;
                }
                else{
                    System.out.println("Please enter a valid choice!");
                }
            }
        }
        else{
            System.out.println("Invalid Atm Pin!");
        }

        sc.close();
    }
}

class Sample{
    private int balance = 1000;

    void checkBalance(){
        System.out.println("Your balance is: " + balance);
    }

    void deposit(int amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Your new balance is: " + balance);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    void withdraw(int amount){
        if(amount > balance){
            System.out.println("Insufficient balance!");
        }
        else if(amount <= 0){
            System.out.println("Invalid amount!");
        }
        else{
            balance -= amount;
            System.out.println("Your new balance is: " + balance);
        }
    }
}