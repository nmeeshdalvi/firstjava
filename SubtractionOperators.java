import java.util.Scanner;
public class SubtractionOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt(); // Read first number
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt(); // Read second number

        // Perform subtraction
        int difference = num1 - num2;
        System.out.println("The difference is " + difference); // Output the result
    }
}
