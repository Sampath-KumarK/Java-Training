import java.util.Scanner;
class Methods1{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String n=s.nextLine();
        Todolist to = new Todolist();
        to.todo(n);
    }
}
class Todolist{
    void todo(String name){
        if(name.isBlank()){
            System.out.println("Please enter your name");
            return ;
        }else{
            System.out.println("Your name is "+name);
        }
        System.out.println("Thanks for entering your name");
    }
}
