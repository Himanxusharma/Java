package Collections.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class ScanArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integers please (EOF or non-integer to terminate):");
        while (sc.hasNextInt()) {
            al.add(sc.nextInt());
        }

            System.out.println(al);
    }
}
