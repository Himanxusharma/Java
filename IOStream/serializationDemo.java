package IOStream;
import java.io.*;
import java.io.Serializable;


public class serializationDemo implements Serializable {
    
    //    String name;
    //    String Address;
    //    int mob;
    //    transient int id;

       public static void main(String[] args) throws IOException {
        
        // serializationDemo s = new serializationDemo();
        // s.name = "Himanshu Sharma";
        // s.Address = "India";
        // s.mob = 98156;
        // s.id = 15;
        Student s1 = new Student("Himanshu Sharma ","India ",986767,55);

        FileOutputStream fos = new FileOutputStream("sdemo.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(s1);
        oos.close();
        
        fos.close();
        System.out.println("Objeect Successfully serialized ");

       }

    


}
