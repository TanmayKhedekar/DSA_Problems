package linkedlist;

public class DoublyLinkedList {
  
    class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null, tail = null;

    // Insert at end
    void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Insert at beginning
    void insertBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Delete from beginning
    void deleteBeginning() {
        if (head == null) return;
        head = head.next;
        if (head != null) head.prev = null;
    }

    // Delete from end
    void deleteEnd() {
        if (tail == null) return;
        tail = tail.prev;
        if (tail != null) tail.next = null;
    }

    // Display forward
    void displayForward() {
        Node temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Display backward
    void displayBackward() {
        Node temp = tail;
        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertEnd(10);
        dll.insertEnd(20);
        dll.insertBeginning(5);

        dll.displayForward();   // 5 <-> 10 <-> 20
        dll.displayBackward();  // 20 <-> 10 <-> 5

        dll.deleteBeginning();
        dll.deleteEnd();

        dll.displayForward();   // 10
    }
}

    

