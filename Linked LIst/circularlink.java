package linkedlist.list;

import java.util.LinkedList;

public class circularlink {

    public static void main(String[] args) {
        LinkedList<String> cdll = new LinkedList<>();
        cdll.add("X");
        cdll.add("Y");
        cdll.add("Z");

        // Forward circular traversal
        int n = 6;
        for (int i = 0; i < n; i++) {
            System.out.print(cdll.get(i % cdll.size()) + " <-> ");
        }
        System.out.println("...");

        // Backward circular traversal
        for (int i = n; i > 0; i--) {
            System.out.print(cdll.get((i + cdll.size() - 1) % cdll.size()) + " <-> ");
        }
        System.out.println("...");
    }
}