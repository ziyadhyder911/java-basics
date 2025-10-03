import java.util.Scanner; // Import Scanner class for user input

public class Recursion {

    // Recursive method to calculate factorial of a number
    static int fact(int n) {
        if (n == 0 || n == 1) // Base case: factorial of 0 or 1 is 1
            return 1;
        return n * fact(n - 1); // Recursive call
    }

    // Main method: entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); // Read the number

        // Calculate factorial using recursive method
        int fact = fact(n);

        // Display the result
        System.out.printf("The factorial of %d is %d", n, fact);

        sc.close(); // Close the scanner to prevent resource leak
    }
}