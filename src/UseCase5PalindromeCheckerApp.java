import java.util.Scanner;
import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== UC5: Stack Based Palindrome Checker =====");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert to lowercase to ignore case sensitivity
        String processedInput = input.toLowerCase();

        // Create a Stack
        Stack<Character> stack = new Stack<>();

        // Push each character into the stack
        for (int i = 0; i < processedInput.length(); i++) {
            stack.push(processedInput.charAt(i));
        }

        // Pop characters from stack and build reversed string
        String reversedString = "";
        while (!stack.isEmpty()) {
            reversedString = reversedString + stack.pop();
        }

        // Compare original and reversed string
        if (processedInput.equals(reversedString)) {
            System.out.println("Result: The string is a PALINDROME.");
        } else {
            System.out.println("Result: The string is NOT a PALINDROME.");
        }

        scanner.close();
    }
}
