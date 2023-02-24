package IOStream;
import java.io.*;

public class FOSDemo {
    public static void main(String[] args) throws IOException, FileNotFoundException{
        FileOutputStream fos = new FileOutputStream("xyz.txt");
        fos.write(5);
        System.out.println("Data is saved");
        fos.close();

    }
}
