package Collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable {
    
    public static void main(String[] args) {
        
    Hashtable <String, Integer> ht1 = new Hashtable<>();
    ht1.put("A",1);
    ht1.put("B",2);
    ht1.put("C",3);
    ht1.put("D",4);
    


    Hashtable <String, Integer> ht2 = new Hashtable<>();
    ht2.put("E",5);
    ht2.put("F",6);
    ht2.put("G",7);
    ht2.put("H",8);


    int valueA = ht1.get("A");
    System.out.println("Value of A: " + valueA);
    
    ht1.remove("A");

    // Enumerating the elements of the hashtable
    Enumeration<String> keys = ht1.keys();
    while (keys.hasMoreElements()) {
        String key = keys.nextElement();
        System.out.println("Key: " + key + ", Value: " + ht1.get(key));
    }

    System.out.println("Mappings of ht1 : " + ht1);
    System.out.println("Mappings of ht2 : " + ht2);


}
}