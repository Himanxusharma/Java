package Array;

import java.util.*;

public class MergeSortArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the first array : ");
        int a = sc.nextInt();
        int[] arr1 = new int[a];
        for (int i = 0; i < a; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of the first array : ");
        int b = sc.nextInt();
        int[] arr2 = new int[b];
        for (int i = 0; i < b; i++) {
            arr2[i] = sc.nextInt();
        }

        int c = arr1.length + arr2.length;
        int[] mergearr = new int[c];
        for (int i = 0; i < arr1.length; i++) {
            mergearr[i] = arr1[i];
        }

        for (int j = 0; j < arr2.length; j++) {
            mergearr[j + arr1.length] = arr2[j];
        }

        Arrays.sort(mergearr);

        // for (int j = 0 ; j < mergearr.length; j++) {
        // System.out.print(mergearr[j] + " ");
        // }

        System.out.println("Merged and sorted array: " + Arrays.toString(mergearr));

    }

}
