package Collections.ArrayList;

import java.util.ArrayList;

public class StackUsingAL {

    public static class Stack {

        private ArrayList<Integer> stack;
        private int capacity;

        public Stack(int capacity) {
            this.capacity = capacity;

            stack = new ArrayList<Integer>(capacity);
        }

        public void push(int element) {
            if (isFull()) {
                System.out.println("stack is full");
            }
            stack.add(element);
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("stack is empty");
            }
            int lastIndex = stack.size() - 1;
            int lastElement = stack.get(lastIndex);
            stack.remove(lastElement);
            return lastElement;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("stack is empty");
            }
            int lastIndex = stack.size() - 1;
	        return stack.get(lastIndex);
        }

        public void search(int element) {

            int temp = stack.lastIndexOf(element);
            if (temp != -1)
                System.out.println("the lastIndexof of " + element + " is " + temp);
            else
                System.out.println(element +"  is not present in the list");

        }

        public int size() {
            return stack.size();
        }

        public boolean isEmpty() {
            return stack.isEmpty();
        }

        public boolean isFull() {
            return stack.size() == capacity;
        }

    }

    public static void main(String[] args) {
        Stack stack = new Stack(6);
        stack.push(9);
        stack.push(20);
        stack.push(30);
        stack.push(10);
        stack.pop();
        stack.push(7);
        System.out.println("stack size is " + stack.size());
        stack.search(10);
        System.out.println(stack.peek());
        if (stack.isEmpty())
            System.out.println("stack Is Empty");
        else
            System.out.println("stack Is Not Empty");

    }

}
