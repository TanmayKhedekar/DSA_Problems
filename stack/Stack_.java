package stack;

public class Stack_ {

    int top;
    int arr[];
    int n;

    // Constructor
    public Stack_(int size) {
        arr = new int[size];
        n = size;
        top = -1;
    }

    // Push operation
    public void push(int x) {
        if (top == n - 1) { // stack is full
            System.out.println("Stack Overflow!");
            return;
        }
        top = top + 1;
        arr[top] = x;
    }

    // Pop operation
    public int pop() {
        if (top == -1) { // stack is empty
            System.out.println("Stack Underflow!");
            return -1;
        }
        int val = arr[top];
        top = top - 1;
        return val;
    }

    // Peek (Top element)
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty!");
            return -1;
        }
        return arr[top];
    }

    // Size of stack
    public int size() {
        return top + 1;
    }

    // Check empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Display stack
    public void display() {
        if (top == -1) {
            System.out.println("Stack is Empty!");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main function to test
    public static void main(String[] args) {
        Stack_ stack = new Stack_(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        stack.display();

        System.out.println("Size: " + stack.size());
        System.out.println("Is Empty? " + stack.isEmpty());
    }
}
