package stack;
import java.util.*;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Top "+stack.peek());
        System.out.println("Pop "+stack.pop());
        System.out.println("Empty "+stack.isEmpty());
        System.out.println("Stack "+stack);


    }
    
}
