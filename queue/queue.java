package queue;
import java.util.*;

public class queue {
    int arr[];
    int front,rear,size,capacity;

    queue(int capacity)
    {
        this.capacity=capacity;
        arr=new int[capacity];
        front=0;
        rear=-1;
        size=0;


    }
    public void enqueue(int x)
    {
        if(size==capacity)
        {
            System.out.println("Overflow");
            return;
        }
        rear++;
        arr[rear]=x;
        size++;
    }
    public boolean isEmpty()
    {
        return size==0;
    }

    public int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Empty");
            return -1;
        }
        int item=arr[front];
        front++;
        size--;
        return item;
    }
    public int peek()
    {
        return arr[front];
    }
    public void display()
    {
         if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[front+i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        queue q=new queue(5);
        q.enqueue(10);
        q.enqueue(23);
        q.enqueue(25);
        q.enqueue(31);
        q.enqueue(45);
        
        q.display();

        System.out.println("Dequeued: " + q.dequeue());
        q.display();

        System.out.println("Peek: " + q.peek());
    }
}
