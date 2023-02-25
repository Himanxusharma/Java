package IOStream;

import java.io.*;

public class DeSerializeDemo implements Serializable{
    

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        
    FileInputStream fis = new FileInputStream("sdemo.txt");
    ObjectInputStream ois = new ObjectInputStream(fis);

    Student s = (Student) ois.readObject();
    ois.close();
    fis.close();
    System.out.println(s.toString());
    

    }



}
