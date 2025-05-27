
import java.util.Scanner;
public class AdditonOperates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt(); // Read first number
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt(); // Read second number

        // Perform addition
        int sum = num1 + num2;
        // int a = 10; 
        // int b = 20; 
        // int c = a + b; 
        System.out.println("The sum is " + sum); // Output the result
    }
}
