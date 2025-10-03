import java.util.Scanner; // Import Scanner class for user input

public class StringMethods {
    public static void main(String[] args) {
        // Create Scanner object to read input from user
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String s1 = sc.nextLine(); // Read the full line including spaces

        // Display the original string
        System.out.println("Original String: " + s1);

        // Convert string to uppercase
        String upper = s1.toUpperCase();
        System.out.println("Uppercase: " + upper);

        // Convert string to lowercase
        String lower = s1.toLowerCase();
        System.out.println("Lowercase: " + lower);

        // Find length of the string
        int length = s1.length();
        System.out.println("Length: " + length);

        // Check if string contains a specific word
        System.out.print("Enter a word to search: ");
        String keyword = sc.nextLine();
        boolean contains = s1.contains(keyword);
        System.out.println("Contains \"" + keyword + "\": " + contains);

        // Extract a substring (first 5 characters or less if shorter)
        String sub = s1.length() >= 5 ? s1.substring(0, 5) : s1;
        System.out.println("Substring (first 5 chars): " + sub);

        // Reverse the string manually
        String reversed = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            reversed += s1.charAt(i);
        }
        System.out.println("Reversed String: " + reversed);

        // Close the scanner to avoid resource leak
        sc.close();
    }
}