

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntersection {
    static void intersection(int a[], int b[]) {
        int i = 0, j = 0;

        while (i < a.length && j < b.length) {

            if (a[i] > b[j]) {
                j++;
            }

            else if (b[j] > a[i]) {
                i++;
            } else {
                // when both are equal
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
    }

    // Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of first Arary : ");
        int n = sc.nextInt();
        System.out.println("Enter the Elements of the array below : ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the size of second Arary : ");
        int m = sc.nextInt();
        System.out.println("Enter the Elements of the array below : ");
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        // sort function
        Arrays.sort(a);
        Arrays.sort(b);
        
        intersection(a, b);
    }
}
