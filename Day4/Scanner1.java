import java.util.Scanner;
public class Scanner1 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String n=s.nextLine();
        
        System.out.print("Enter Your Roll Number: ");
        String rollnum = s.nextLine();

        System.out.print("Enter Your Age: ");
        int age= s.nextInt();
        
        System.out.print("Enter Your Phone Number: ");
        long phone = s.nextLong();
        
        System.out.print("Enter Your CGPA: ");
        float cgpa = s.nextFloat();
        
        System.out.println("How may languages do you known: ");
        int lang = s.nextInt();
        // for(int i=0;i<lang;i++){
        //     System.out.print("Enter Language "+(i+1)+": ");
        //     String language = s.next();
        //     System.out.println("Language "+(i+1)+": "+language);
        // }
        System.out.println("Welcome "+n);
        System.out.println("Roll Number: " + rollnum);
        System.out.println("Your age is "+age);
        System.out.println("Your Phone Number is "+phone);
        System.out.println("Your CGPA is "+cgpa);
        System.out.println("You know "+lang+" languages.");

    }

}
