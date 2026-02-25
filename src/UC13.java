import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
public class UC13 {

    public static void main(String[] args) {

        String input = "level";

        PalindromeStrategy stackStrategy = new StackStrategy();
        PalindromeStrategy dequeStrategy = new DequeStrategy();

        long start1 = System.nanoTime();
        boolean result1 = stackStrategy.check(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean result2 = dequeStrategy.check(input);
        long end2 = System.nanoTime();

        System.out.println("Input : " + input);

        System.out.println("Stack Result : " + result1);
        System.out.println("Stack Execution Time : " + (end1 - start1) + " ns");

        System.out.println("Deque Result : " + result2);
        System.out.println("Deque Execution Time : " + (end2 - start2) + " ns");
    }
}