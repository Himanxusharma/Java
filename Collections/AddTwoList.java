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

        ll2.addAll(ll1);
        
        System.out.println("addAll(Collection<? extends E> c) method: "+ll2);  




    }
    
}
