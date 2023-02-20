package Array;

class Queue {

    static private int front, rear, capacity;
    static private int queue[];

    Queue(int c) {
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];

    }

    static void QueueEnqueue(int data) {

        if (capacity == rear) {
            System.out.println("The Queue is full.");
            return;
        } else {

            queue[rear] = data;
            rear++;

        }
        return;
    }

    static void QueueDequeue() {
        if (front == rear) {
            System.out.println("The Queue is Empty.");
        }

        else {

            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }

            // store 0 at rear indicating there's no element
            if (rear < capacity)
                queue[rear] = 0;

            // decrement rear
            rear--;
        }
        return;
    }

    static void QueueDisplay() {
        int i;
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }

        // traverse front to rear and print elements
        for (i = front; i < rear; i++) {
            System.out.printf(" %d <-- ", queue[i]);
        }
        return;
    }

    static void queueFront() {
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
        System.out.printf("\nFront Element is: %d", queue[front]);
        return;
    }

}

public class QueueUsingArray {

    public static void main(String[] args) {

        // Create a queue of capacity 4
        Queue q = new Queue(4);

        q.QueueDisplay();

        // inserting elements in the queue
        q.QueueEnqueue(20);
        q.QueueEnqueue(30);
        q.QueueEnqueue(40);
        q.QueueEnqueue(50);

        // print Queue elements
        q.QueueDisplay();

        // insert element in the queue
        q.QueueEnqueue(60);

        // print Queue elements
        q.QueueDisplay();

        q.QueueDequeue();
        q.QueueDequeue();
        System.out.printf("\nafter two node deletion\n\n");

        // print Queue elements
        q.QueueDisplay();
        q.queueFront();
    }
}
