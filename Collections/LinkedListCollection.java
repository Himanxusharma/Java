package Collections;
import java.util.*;

public class LinkedListCollection {
    
        public static void main(String[] args) {
            
            LinkedList<String> list = new LinkedList<String>();  
            list.add("Himanshu");
            list.add("1011");
            list.add("HoneySingh");

            Iterator <String> itr = list.iterator();

            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }





}
