import java.util.Scanner; // Import Scanner class for user input

public class VarArgs {

    // Method using varargs to calculate the sum of integers
    static int sum(int... arr) {
        int res = 0;
        for (int a : arr) {
            res += a; // Add each element to the result
        }
        return res; // Return the final sum
    }

    public static void main(String[] args) {
        // Create Scanner object to read input from user
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the size of the array
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        // Declare and initialize array to hold user input
        int[] sumarr = new int[n];

        // Read 'n' numbers from the user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + "th Number: ");
            sumarr[i] = sc.nextInt();
        }

        // Call the varargs method to calculate the sum
        int result = sum(sumarr);

        // Display the result
        System.out.println("The sum of entered numbers is: " + result);

        // Close the scanner to prevent resource leak
        sc.close();
    }
}