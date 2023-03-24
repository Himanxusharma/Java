// Java Program to Convert File to a Byte Array
// Using Files.readAllBytes() Method
// Importing required classes
import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

// Main class
public class Test {

	// Main driver method
	public static void main(String[] args)
		throws IOException,FileNotFoundException
	{

		// Creating an object of Path class and
		// assigning local directory path of file to it
		Path path = Paths.get(
			"/IOStream/read.txt");

		// Converting the file into a byte array
		// using Files.readAllBytes() method
		byte[] arr = Files.readAllBytes(path);

		// Printing the above byte array
		System.out.println(Arrays.toString(arr));
	}
}
