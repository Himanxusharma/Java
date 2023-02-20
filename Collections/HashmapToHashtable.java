package Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
public class HashmapToHashtable {

    public static void main(String[] args) {
        
        Map <String, Integer> hm = new HashMap<>();
        hm.put("One",1);
        hm.put("Two",2);
        hm.put("Three",3);
        hm.put("Four",4);
        hm.put("Five",5);
        hm.put("Six",6);

        Hashtable< String, Integer> ht = new Hashtable<>(hm);
        System.out.println("Mappings of hashtable : " + ht);

        System.out.println("Size of map is:- " + ht.size());
        System.out.println(ht);

        if (ht.containsKey("Four")) {
            Integer a = ht.get("Four");
            System.out.println("value for key" + " \"Four\" is:- " + a);
        }

        // Update the value at key 2
        ht.put("Six", 066);
        ht.remove("Four");
        System.out.println("Mappings of hashtable : " + ht);
        
        for (Map.Entry<String, Integer> e : ht.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());

    }
    
}
