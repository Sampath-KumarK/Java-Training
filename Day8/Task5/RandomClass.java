// Write a Java program using Random to generate:
// 1.	Student ID → nextInt(1000) (0–999)
// 2.	Marks → nextDouble() * 100
// 3.	Attendance → nextFloat() * 100
// 4.	Status → nextBoolean() (Pass/Fail)
// 5.	Registration Number → nextLong()
// 6.	Performance Score → nextGaussian() * 10
// 7.	Random Bytes → nextBytes() (array size 5)
// 8.	5 Random Numbers → ints() stream

import java.util.*;
public class RandomClass {
    public static void main(String[] args) {
        Random r = new Random();
        int studentId = r.nextInt(1000); 
        System.out.println("Random Student ID: " + studentId);
        double marks = r.nextDouble() * 100;
        System.out.println("Random Marks: " + marks);   
        float attendance = r.nextFloat() * 100;
        System.out.println("Random Attendance: " + attendance);
        boolean status = r.nextBoolean();
        System.out.println("Random Status (Pass/Fail): " + (status ? "Pass" : "Fail"));
        long regNumber = r.nextLong();
        System.out.println("Random Registration Number: " + regNumber);
        double performanceScore = r.nextGaussian() * 10;
        System.out.println("Random Performance Score: " + performanceScore);
        byte[] randomBytes = new byte[5];
        r.nextBytes(randomBytes);
        System.out.println("Random Bytes: " + Arrays.toString(randomBytes));
        System.out.println("5 Random Numbers:");
        r.ints(5).forEach(System.out::println);

    }
    
}
