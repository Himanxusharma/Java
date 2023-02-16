package Array;

import java.util.Scanner;

public class MaxNum2d {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num. of rows : ");
        int a = sc.nextInt();
        System.out.print("Enter the num. of Column : ");
        int b = sc.nextInt();

        int[][] arr = new int[a][b];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = sc.nextInt();
            }
        }

        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] > max) {
                    max = arr[i][j];

                }
            }
        }

        System.out.println("Minimum num in the array is  : " + max);
    }
}
