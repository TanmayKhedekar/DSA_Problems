package queue;

public class queueusingarray {
    class queues {
        int arr[];
        int size;
        int front, rear, count;

        queues(int size) {
            this.size = size;
            arr = new int[size];
            front = 0;
            rear = -1;
            count = 0;
        }

        void enqueue(int x) {
            if (isFull()) {
                System.out.println("Queue Overflow");
                return;
            }
            rear = (rear + 1) % size;
            arr[rear] = x;
            count++;
        }

        int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue Underflow");
                return -1;
            }
            int val = arr[front];
            front = (front + 1) % size;
            count--;
            return val;
        }

        int top() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }

        boolean isEmpty() {
            return count == 0;
        }

        boolean isFull() {
            return count == size;
        }

        void printque() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.print("Queue elements: ");
            for (int i = 0; i < count; i++) {
                int index = (front + i) % size;
                System.out.print(arr[index] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        queueusingarray sc = new queueusingarray();
        queues mb = sc.new queues(10);

        mb.enqueue(10);
        mb.enqueue(20);
        mb.enqueue(30);
        mb.enqueue(40);
        mb.enqueue(50);

        mb.dequeue(); // Removes 10

        mb.printque(); // Should print 20 30 40 50
    }
}
