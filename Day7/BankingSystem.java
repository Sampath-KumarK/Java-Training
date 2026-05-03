import java.util.Scanner;
public class BankingSystem {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int atmppin = 2005;
        Sample s = new Sample();
        System.out.println("Welcome to the Banking System!");
        System.out.println("Enter Your Atm Pin: ");
        int atmpin = sc.nextInt();
        if(atmpin == 2005){
            System.out.println("Welcome to your account!");
            System.out.println("Press 1 to check balance\n Press 2 to deposit money\n Press 3 to withdraw money");
            int choise = sc.nextInt();
            if(choise == 1){
                s.checkBalance();
            }
            else if(choise ==2){
                System.out.println("Enter the amount to deposit: ");
                int amount = sc.nextInt();
                s.deposit(amount);
            }
            else if(choise == 3){
                System.out.println("Enter the amount to withdraw: ");
                int amount = sc.nextInt();
                s.withdraw(amount);
            }
            else{
                System.out.println("Please enter a valid choice!");
            }
        }
        else{
            System.out.println("Invalid Atm Pin!");
        }


    }
}
class Sample{
    private int balance=1000;
    void checkBalance(){
        System.out.println("Your balance is: " + balance);
    }
    void deposit(int amount){
        balance+=amount;
        System.out.println("Your new balance is: " + balance);
    }
    void withdraw(int amount){
        if(amount>balance){
            System.out.println("Insufficient balance!");
        }
        else{
            balance-=amount;
            System.out.println("Your new balance is: " + balance);
        }
    }

}
