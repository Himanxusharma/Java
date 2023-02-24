package IOStream;

import java.io.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class readUsingByte {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        // FileInputStream fis = new FileInputStream("Read.txt");

        File path = new File("IOStream/read.txt");

        byte[] array = method(path); // convert file to byte array

        System.out.println("\n\nThe Byte of Array print Using read(byte[]) method of FileInputStream class.\n");
        System.out.print(Arrays.toString(array)); // Printing the byte array
        System.out.println("\n\nafter converting the byte array to string   :\n");
        String str = new String(array);     //convert byte array to string.
        System.out.println(str);

        System.out.println("\n\nThe Byte of Array print Using the readALLByte() method.\n");
        Path path2 = Paths.get("/Users/hisharma/Desktop/Java-Learning/IOStream/read.txt");
        byte[] arr = Files.readAllBytes(path2);
        System.out.println(Arrays.toString(arr));

        System.out.println("\n\nafter converting the byte array to string   :\n");
        String str2 = new String(arr);     //convert byte array to string.
        System.out.println(str2);

    }

    private static byte[] method(File file) throws IOException {

        FileInputStream fis = new FileInputStream(file);

        // FileInputStream fis1 = new FileInputStream("IOStream/read.txt");
        // int data;
        // while ((data=fis1.read())!=-1) {      //we can also read this method to read byte by byte
        //     System.out.print((char)data+" ");
        // }

        byte[] arr = new byte[(int) file.length()]; //  creating byte array of same length as file

        

        fis.read(arr);

        fis.close();

        return arr;
    }
}
