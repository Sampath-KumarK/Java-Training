// Task 1: StringBuilder – Profile Bio Creator
//   Scenario:
//  A social media app allows users to create a short profile bio by combining different details.
//  Task:
// ●	First name = "Arun"
// ●	City = "Chennai"
// ●	Hobby = "Cricket"
//  Use StringBuilder to:
// 1.	Combine all details into one sentence
// 2.	Add spaces properly
// 3.	Convert the entire sentence to uppercase
//  Expected Output:
//  ARUN FROM CHENNAI LOVES CRICKET

public class ConcadinateSB {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder();
        String firstName = "Arun";
        String city = "Chennai";
        String hobby = "Cricket";
        sb.append(firstName);
        sb.append(" FROM ");
        sb.append(city);
        sb.append(" LOVES ");
        sb.append(hobby);

        System.out.println(sb.toString().toUpperCase());
    }
}
