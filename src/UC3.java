/**
 * ==========================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * ==========================================================
 *
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * @author Developer
 * @version 3.0
 */

public class UC3 {

    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "madam";
        String reversed = "";

        // Iterate from last character to first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        boolean isPalindrome = input.equals(reversed);

        System.out.println("Input : " + input);
        System.out.println("Reversed : " + reversed);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}