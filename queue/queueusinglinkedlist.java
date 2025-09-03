package queue;

import java.util.LinkedList;
import java.util.Queue;

public class queueusinglinkedlist {

      // Create a Queue using LinkedList
        Queue<Integer> q = new LinkedList<>();

        // Enqueue (add elements)
        q.add(10);
        q.add(23);
        q.add(25);
        q.add(31);
        q.add(45);

        // Display queue
        System.out.println("Queue: " + q);

        // Dequeue (remove element from front)
        System.out.println("Dequeued: " + q.poll());

        // Display queue after dequeue
        System.out.println("Queue after dequeue: " + q);

        // Peek (see front element without removing)
        System.out.println("Peek: " + q.peek());

        // Check size
        System.out.println("Size: " + q.size());

        // Check if empty
        System.out.println("Is Empty? " + q.isEmpty());
    
}
