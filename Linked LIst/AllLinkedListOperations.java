package linkedlist;
  import java.util.LinkedList;

public class AllLinkedListOperations {

  


    public static void main(String[] args) {
        // ---------------------- //
        // 1. Singly/Doubly using java.util.LinkedList
        // ---------------------- //
        System.out.println("🔗 Built-in (Singly/Doubly):");
        LinkedList<Integer> list = new LinkedList<>();

        // Insert
        list.add(10);           // end
        list.addFirst(5);       // beginning
        list.addLast(15);       // end
        list.add(1, 7);         // index 1
        System.out.println("List: " + list);

        // Delete
        list.removeFirst();     // 5 removed
        list.removeLast();      // 15 removed
        list.remove(1);         // 10 removed
        System.out.println("After deletions: " + list);

        // Search
        System.out.println("Contains 7? " + list.contains(7));
        System.out.println("Index of 7: " + list.indexOf(7));

        // Access
        System.out.println("Element at 0: " + list.get(0));
        System.out.println("Size: " + list.size());

        list.clear();
        System.out.println("Cleared List: " + list);

        // ---------------------- //
        // 2. Circular Linked List (Custom)
        // ---------------------- //
        System.out.println("\n🔁 Custom Circular Linked List:");
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertEnd(1);
        cll.insertEnd(2);
        cll.insertBeginning(0);
        cll.display();

        cll.deleteBeginning();
        cll.deleteEnd();
        cll.display();
    }
}

// ---------------------- //
// Custom Circular Linked List
// ---------------------- //
class CircularLinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

    void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    void insertBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    void deleteBeginning() {
        if (head == null) return;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
    }

    void deleteEnd() {
        if (head == null) return;
        if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = head;
            tail = temp;
        }
    }

    void display() {
        if (head == null) {
            System.out.println("Circular List is empty.");
            return;
        }

        Node temp = head;
        System.out.print("Circular List: ");
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }
}

