package Collections;
import java.util.*;  

class al{  
public static void main(String args[]){  
    ArrayList<String> al=new ArrayList<String>(); 

    al.add("Himanshu");  
    al.add("Ishu");  
    al.add("Kunal");  
    al.add("rohan");  

    al.add(1,"This line create Concurrent Modification Exception in iterator while loop");

    //List <String> List = new CopyOnWriteArray<> (fruit);

    Iterator itr=al.iterator();  
    while(itr.hasNext()){  
        System.out.println(itr.next());  
    }  
}  
}  
