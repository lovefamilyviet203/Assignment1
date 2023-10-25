import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Push elements onto the stack
        stack.push("A");
        stack.push("B");
        stack.push("C");

        // Now the stack contains "A" at the bottom, "B" in the middle, and "C" on top

        // Pop the top element
        String popped = stack.pop();
        System.out.println("Popped: " + popped); // This will print "Popped: C"

        // Peek at the top element without removing it
        String peeked = stack.peek();
        System.out.println("Peeked: " + peeked); // This will print "Peeked: B"
    }
}