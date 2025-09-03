package Tree;

public class BinaryTree {
    int arr[];
    int size;

    // Constructor
    BinaryTree(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    // Insert Node
    public void insert(int val) {
        if (size >= arr.length) {
            System.out.println("Tree is full");
            return;
        }
        arr[size] = val;
        size++;
    }

    // Preorder Traversal
    public void preorder(int index) {
        if (index >= size) return;
        System.out.print(arr[index] + " ");
        preorder(2 * index + 1);
        preorder(2 * index + 2);
    }

    // Inorder Traversal
    public void inorder(int index) {
        if (index >= size) return;
        inorder(2 * index + 1);
        System.out.print(arr[index] + " ");
        inorder(2 * index + 2);
    }

    // Postorder Traversal
    public void postorder(int index) {
        if (index >= size) return;
        postorder(2 * index + 1);
        postorder(2 * index + 2);
        System.out.print(arr[index] + " ");
    }

    // Level Order Traversal
    public void levelOrder() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Find Maximum
    public int findMax() {
        if (size == 0) return -1;
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    // Find Minimum
    public int findMin() {
        if (size == 0) return -1;
        int min = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    // Height of Tree
    public int height() {
        return (int) Math.ceil(Math.log(size + 1) / Math.log(2)) - 1;
    }

    // Search an element
    public boolean search(int val) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == val) return true;
        }
        return false;
    }

    // Count total nodes
    public int countNodes() {
        return size;
    }

    // Count leaf nodes
    public int countLeafNodes() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            if (left >= size && right >= size) count++;
        }
        return count;
    }

    // Delete node (replace with last element)
    public void delete(int val) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == val) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Value not found!");
            return;
        }
        arr[index] = arr[size - 1]; // Replace with last
        size--; // Reduce size
    }

    // Mirror the tree
    public void mirror(int index) {
        if (index >= size) return;
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        if (left < size && right < size) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        mirror(left);
        mirror(right);
    }

    // Main function
    public static void main(String[] args) {
        BinaryTree t = new BinaryTree(15);
        t.insert(1);
        t.insert(2);
        t.insert(3);
        t.insert(4);
        t.insert(5);
        t.insert(6);
        t.insert(7);

        System.out.print("Preorder: "); t.preorder(0); System.out.println();
        System.out.print("Inorder: "); t.inorder(0); System.out.println();
        System.out.print("Postorder: "); t.postorder(0); System.out.println();
        System.out.print("Level Order: "); t.levelOrder();

        System.out.println("Max: " + t.findMax());
        System.out.println("Min: " + t.findMin());
        System.out.println("Height: " + t.height());
        System.out.println("Total Nodes: " + t.countNodes());
        System.out.println("Leaf Nodes: " + t.countLeafNodes());
        System.out.println("Search(5): " + t.search(5));

        t.delete(3);
        System.out.print("After deleting 3 (Level Order): "); t.levelOrder();

        t.mirror(0);
        System.out.print("After Mirroring (Level Order): "); t.levelOrder();
    }
}
