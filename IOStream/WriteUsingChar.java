package IOStream;
import java.io.*;


public class WriteUsingChar {
    
	static String output = "Hello! This program to write using Char Stream.";
    public static void main(String[] args) throws FileNotFoundException,IOException{

        //FileOutputStream foutStream = new FileOutputStream("");
        FileWriter f = new FileWriter("WriteUsingChar.txt");

        	
        	f.write(output);	// using write method to write the content into the file

        	
        	f.close();	// closing a file

        	
        	System.out.println("Content is successfully added into the WriteUsingChar.txt file.");	// displaying a message after successfully writing into a file


    }
}
