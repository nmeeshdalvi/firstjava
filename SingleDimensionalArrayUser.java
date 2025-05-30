import java.util.Arrays;
import java.util.Scanner;
public class SingleDimensionalArrayUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");

        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        // There are types of arrays in Java, one of them is single dimensional array
        // data type[] arratName = new data type[size];
        String arr[] = new String[n];

        //Taking input from the user
        for (int i=0; i < n; i++){
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextLine();
        }

        //Converting the array to a string
        System.out.println("Array elements:" + Arrays.toString(arr));
    }

}
