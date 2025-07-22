package linkedlist;


    import java.util.LinkedList;

public class AllLinkedListTypes {
    public static void main(String[] args) {

        // 1️⃣ Doubly Linked List (Built-in)
        System.out.println("🔁 Doubly Linked List (Built-in):");
        LinkedList<Integer> dll = new LinkedList<>();
        dll.addFirst(20);
        dll.addLast(40);
        dll.add(1, 30);  // Insert at index
        System.out.println("List: " + dll);
        dll.removeFirst();
        dll.removeLast();
        System.out.println("After deletions: " + dll);
        System.out.println("Contains 30? " + dll.contains(30));
        System.out.println("Size: " + dll.size());
        dll.clear();
        System.out.println("Cleared List: " + dll);

        // 2️⃣ Singly Linked List (Custom)
        System.out.println("\n🔗 Singly Linked List (Custom):");
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertEnd(1);
        sll.insertEnd(2);
        sll.insertBeginning(0);
        sll.insertAtPosition(5, 2);
        sll.display();
        sll.deleteBeginning();
        sll.deleteEnd();
        sll.deleteAtPosition(1);
        sll.display();
        System.out.println("Search 5: " + sll.search(5));

        // 3️⃣ Circular Linked List (Custom)
        System.out.println("\n🔄 Circular Linked List (Custom):");
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertEnd(11);
        cll.insertEnd(22);
        cll.insertBeginning(5);
        cll.display();
        cll.deleteBeginning();
        cll.deleteEnd();
        cll.display();
    }
}

// ---------------------- //
// Singly Linked List
// ---------------------- //
class SinglyLinkedList {
    class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    Node head;

    void insertBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    void insertAtPosition(int data, int pos) {
        if (pos == 0) {
            insertBeginning(data); return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; temp != null && i < pos - 1; i++)
            temp = temp.next;
        if (temp == null) return;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void deleteBeginning() {
        if (head != null) head = head.next;
    }

    void deleteEnd() {
        if (head == null || head.next == null) {
            head = null; return;
        }
        Node temp = head;
        while (temp.next.next != null) temp = temp.next;
        temp.next = null;
    }

    void deleteAtPosition(int pos) {
        if (pos == 0) {
            deleteBeginning(); return;
        }
        Node temp = head;
        for (int i = 0; temp != null && i < pos - 1; i++)
            temp = temp.next;
        if (temp == null || temp.next == null) return;
        temp.next = temp.next.next;
    }

    boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) return true;
            temp = temp.next;
        }
        return false;
    }

    void display() {
        Node temp = head;
        System.out.print("SLL: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

// ---------------------- //
// Circular Linked List
// ---------------------- //
class CircularLinkedList {
    class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    Node head = null, tail = null;

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
            while (temp.next != tail)
                temp = temp.next;
            temp.next = head;
            tail = temp;
        }
    }

    void display() {
        if (head == null) {
            System.out.println("CLL is empty.");
            return;
        }
        Node temp = head;
        System.out.print("CLL: ");
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }
}

    

