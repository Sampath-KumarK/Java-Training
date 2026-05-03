import java.util.*;
public class Userpass{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        userdata ud = new userdata();
        System.out.print("Enter the user name: ");
        String name = s.nextLine();
        System.out.print("Enter the password: ");
        double pass = s.nextDouble();
        boolean result = ud.checkdata(name,pass);
        if(result == true){
            System.out.println("User Login Sucessfully.......");
        }else{
            System.out.println("Invalid Login......");
        }
    }
}
class userdata{
    private String name = "SampathKumar";
    private double pass = 2005;
    boolean checkdata(String n,double p){
        if(n.equals(name) && p == pass){
            return true;
        }
        else{
            return false;
        }
        
    }
}