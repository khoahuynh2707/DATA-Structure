package OnlineBook;

import java.util.ArrayList;

public class StackADT<T> {
    private final ArrayList<T> stack;

    public StackADT() {
        stack = new ArrayList<>();
    }

    // Push an item onto the stack
    public void push(T item) {
        stack.add(item);
    }

    // Pop an item from the stack
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.remove(stack.size() - 1);
    }

    // Peek at the top item of the stack
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.get(stack.size() - 1);
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Get the size of the stack
    public int size() {
        return stack.size();
    }
}
