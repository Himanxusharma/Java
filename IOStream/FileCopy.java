package IOStream;
import java.io.*;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) throws IOException,FileNotFoundException {
        
        

        Scanner scan = new Scanner(System.in);
        
        System.out.print("\nEnter Source file name : ");
        String srcFile = scan.nextLine();

        System.out.print("\nEnter Destination file name : ");
        String destFile = scan.nextLine();

        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);

        int data;
        while ((data=fis.read())!=-1) {
            fos.write(data);
        }
        System.out.println("File copied Successfully");

        fos.close();
        fis.close();


    }
}
