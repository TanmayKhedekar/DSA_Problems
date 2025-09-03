package stack;

import java.util.LinkedList;

public class stackusinglinkedlist {

    LinkedList<Integer> stack;

    // Constructor
    public stackusinglinkedlist() {
        stack = new LinkedList<>();
    }

    // Push operation
    public void push(int x) {
        stack.addFirst(x);  // insert at head
    }

    // Pop operation
    public int pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return stack.removeFirst(); // remove head
    }

    // Peek operation
    public int peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        }
        return stack.getFirst(); // get head
    }

    // Size of stack
    public int size() {
        return stack.size();
    }

    // Check if empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Display stack elements
    public void display() {
        System.out.println("Stack elements: " + stack);
    }

    // Main to test
    public static void main(String[] args) {
        stackusinglinkedlist s = new stackusinglinkedlist();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display(); // [30, 20, 10]

        System.out.println("Peek: " + s.peek()); 
        System.out.println("Pop: " + s.pop());
        s.display(); // [20, 10]

        System.out.println("Size: " + s.size());
        System.out.println("Is Empty? " + s.isEmpty());
    }
    
}
