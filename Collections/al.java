package Collections;
import java.util.*;  

class al{  
public static void main(String args[]){  
    ArrayList<String> al=new ArrayList<String>(); 
    al.add("Himanshu");  
    al.add("Ishu");  
    al.add("Kunal");  
    al.add("rohan");  
    Iterator itr=al.iterator();  
    while(itr.hasNext()){  
        System.out.println(itr.next());  
    }  
}  
}  
