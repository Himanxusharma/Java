package Collections.ArrayList;

import java.util.ArrayList;

public class QueueUsingAL {

    public static class Queue {

        private ArrayList<Integer> queue;
        private int capacity;

        public Queue(int capacity) {
            this.capacity = capacity;

            queue = new ArrayList<Integer>(capacity);
        }

        public void QueueEnqueue(int element) {
            if (isFull()) {
                System.out.println("Queue is full");
            }
            queue.add(element);
        }

        public int QueueDequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
            }
            int firstElement = queue.get(0);
            queue.remove(0);
            return firstElement;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
            }
            return queue.get(0);
        }

        public int size() {
            return queue.size();
        }

        public boolean isEmpty() {
            return queue.isEmpty();
        }

        public boolean isFull() {
            return queue.size() == capacity;
        }

        
    }

    public static void main(String[] args) {
        Queue queue = new Queue(6);
        queue.QueueEnqueue(9);
        queue.QueueEnqueue(20);
        queue.QueueEnqueue(30);
        queue.QueueEnqueue(10);
        queue.QueueDequeue();
        queue.QueueEnqueue(7);
        System.out.println("Queue size is " + queue.size());
        System.out.println(queue.peek());
        if (queue.isEmpty())
            System.out.println("Queue Is Empty");
        else
            System.out.println("Queue Is Not Empty");

    }

}
