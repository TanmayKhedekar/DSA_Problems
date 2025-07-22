public class reverse {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    // Insert at End
    public void insert(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newnode;
    }

    // Display List
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    // Search an element
    public void search(int key) {
        Node current = head;
        int position = 1;
        while (current != null) {
            if (current.data == key) {
                System.out.println("Element " + key + " found at position: " + position);
                return;
            }
            current = current.next;
            position++;
        }
        System.out.println("Element " + key + " not found.");
    }

    // Reverse the linked list
    public void reverses() {
        Node prev = null;
        Node current = head;
        Node nextNode;

        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        head = prev;
    }

    // Main Method
    public static void main(String[] args) {
        reverse s = new reverse();
        s.insert(13);
        s.insert(14);
        s.insert(15);
        s.insert(16);

        System.out.println("Original List:");
        s.display();

        s.search(15);
        s.search(99);

        System.out.println("\nReversed List:");
        s.reverses();
        s.display();
    }
}
 {
    
}
