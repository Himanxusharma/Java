package IOStream;
import java.io.*;
public class WriteUsingByte {
 
public static void main(String[] args) throws FileNotFoundException, IOException {
    
    FileOutputStream foutByte = new FileOutputStream("WriteUsingByte.txt");
            String output = "This is program to write Bytes using ByteStream.";
 
            byte b[] = output.getBytes();    //Converting string into byte array
 
            foutByte.write(b);  //Write byte data to file output
 
            foutByte.close();       //Close the file

            System.out.println("Content is successfully added into the WriteUsingByte.txt file.");	// displaying a message after successfully writing into a file
}

}
