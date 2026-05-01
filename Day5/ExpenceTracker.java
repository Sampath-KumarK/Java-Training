import java.util.Scanner;
public class ExpenceTracker {
    public static void main(String[] args) {
        Tracker t = new Tracker();
        int ans = t.add();
        System.out.println("The total expence : "+ans);
    }
}
class Tracker{
    int total=0;
    int add(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Expence name: ");
        String expname = s.nextLine();
        System.out.println("Enter your Expence amount: ");
        double expamount = s.nextDouble();
        total+=expamount;
        System.out.println("If you want to exit press 0 or press 1 to continue");
        int exit = s.nextInt();
        if(exit == 0){
            System.out.println("Exiting...");
            return total;
        }else{
            return add();
        }
    }
}
