import java.util.Scanner; // Import Scanner class for user input

public class Methods {

    // Main method: entry point of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        // Prompt user to enter two numbers
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();

        System.out.print("Enter number 2: ");
        int b = sc.nextInt();

        // Create object to access instance methods
        Methods obj = new Methods();

        // Perform operations
        int sum = obj.add(a, b);
        int diff = obj.subtract(a, b);
        int prod = obj.multiply(a, b);
        double quot = obj.divide(a, b);

        // Display results
        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + diff);
        System.out.println("The product is: " + prod);
        System.out.println("The quotient is: " + quot);

        sc.close(); // Close the scanner to prevent resource leak
    }

    // Method to add two integers
    int add(int x, int y) {
        return x + y;
    }

    // Method to subtract two integers
    int subtract(int x, int y) {
        return x - y;
    }

    // Method to multiply two integers
    int multiply(int x, int y) {
        return x * y;
    }

    // Method to divide two integers (with zero check)
    double divide(int x, int y) {
        if (y == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; // Return Not-a-Number
        }
        return (double) x / y;
    }
}