// Task 2:
// Write a Java program using Math class to perform the following:
// 1.	Find Maximum & Minimum marks → Math.max(), Math.min()
// 2.	Round the marks → Math.round()
// 3.	Find Square & Square Root → Math.pow(), Math.sqrt()
// 4.	Find Absolute difference → Math.abs()
// 5.	Find Ceiling & Floor values → Math.ceil(), Math.floor()
// 6.	Find random number (0–100) → Math.random()
// 7.	Find exponential value → Math.exp()
// 8.	Find logarithm → Math.log()
// 9.	Find sine & cosine values → Math.sin(), Math.cos()
// 10.	Find cube of a number → Math.pow(num, 3)

public class Math1 {
    public static void main(String[] args) {
        double num1 = 25.5;
        double num2 = 10.2;

        System.out.println("Maximum Marks: " + Math.max(num1, num2));
        System.out.println("Minimum Marks: " + Math.min(num1, num2));
        System.out.println("Rounded Marks: " + Math.round(num1));
        System.out.println("Square of num1: " + Math.pow(num1, 2));
        System.out.println("Square Root of num1: " + Math.sqrt(num1));
        System.out.println("Absolute Difference: " + Math.abs(num1 - num2));
        System.out.println("Ceiling Value of num1: " + Math.ceil(num1));
        System.out.println("Floor Value of num1: " + Math.floor(num1));
        System.out.println("Random Number (0-100): " + (int)(Math.random() * 101));
        System.out.println("Exponential Value of num1: " + Math.exp(num1));
        System.out.println("Logarithm of num1: " + Math.log(num1));
        System.out.println("Sine of num1: " + Math.sin(Math.toRadians(num1)));
        System.out.println("Cosine of num1: " + Math.cos(Math.toRadians(num1)));
        System.out.println("Cube of num1: " + Math.pow(num1, 3));
    }
}
