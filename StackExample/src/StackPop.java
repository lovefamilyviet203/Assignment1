import java.util.Stack;

public class StackPop {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Push elements onto the stack
        stack.push("A");
        stack.push("B");
        stack.push("C");

        // Pop the top element
        String popped = stack.pop();
        System.out.println("Popped: " + popped); // This will print "Popped: C"

        // The stack now contains "A" at the bottom and "B" in the middle.
    }
}
