package Collections;

import java.util.*;

public class AddTwoList {

    public static void main(String[] args) {
        
        LinkedList <String> ll1 = new LinkedList<String>();
        ll1.add("Himanshu");
        ll1.add("Hello");
        ll1.add("Traffic");
        ll1.add("99");

        LinkedList <String> ll2 = new LinkedList<String>();
        ll2.add("10");
        ll2.add("20");
        ll2.add("30");

        LinkedList <String> ll3 = new LinkedList<String>();
        ll3.add("Vibo");
        ll3.add("3.00");

        ll2.addAll(ll1);
        System.out.println("\naddAll(int index, Collection<? extends E> c) method: "+ll2);
 
        ll2.addAll(ll3);

        System.out.println("\naddAll(int index, Collection<? extends E> c) method: "+ll);  

        ll2.addFirst("Nothing");  
        System.out.print("addFirst(E e) method: "+ll2);  
        //Adding an element at the last position  
        ll2.addLast("Harsh");  
        System.out.print("\naddLast(E e) method: "+ll2);  




    }
    
}
