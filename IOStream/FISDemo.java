package IOStream;

import java.io.*;

public class FISDemo {
    
    public static void main(String[] args) throws IOException,FileNotFoundException {
        FileInputStream fis = new FileInputStream("abc.txt");

        //int data = fis.read(); //will read byte wise data single byte at a time
        int data;
        while ((data=fis.read())!=-1) {
            System.out.println("data    " + data + "   " + (char)data);
        }
        fis.close();


    }


}
