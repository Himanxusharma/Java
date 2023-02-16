//https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true
package HackerRank;

import java.io.*;
import java.util.*;
import java.lang.*;

public class JavaStdinAndStdoutII {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double d = sc.nextDouble();
        String s = sc.nextLine();
        String str = sc.nextLine();

        System.out.println("String: " + str);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }
}
