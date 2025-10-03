import java.util.Scanner; // Importing Scanner class for user input

public class Arrays {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompting user to enter the size of the array
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt(); // Reading the size of the array

        // Declaring an integer array of size 'n'
        int[] arr = new int[n];

        // Prompting user to enter array elements
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // Reading each element and storing in the array
        }

        // Displaying the array elements
        System.out.print("Array Elements: ");
        for (int j : arr) {
            System.out.printf("%d ", j); // Printing each element using enhanced for loop
        }
    }
}