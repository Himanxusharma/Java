
//row wise sorting is here

import java.io.*;
import java.util.*;

public class Sort3dRowWise {

    static int sort3d(int arr[][][]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    for (int x = 0; x < arr.length; x++) {
                        for (int y = 0; y < arr[i].length; y++) {
                            for (int z = 0; z < arr[i][j].length; z++) {
                                if (arr[i][j][k] < arr[x][y][z]) {
                                    int temp = arr[i][j][k];
                                    arr[i][j][k] = arr[x][y][z];
                                    arr[x][y][z] = temp;
                                }
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Layer " + i);
            for (int j = 0; j < arr[i].length; j++) {

                for (int k = 0; k < arr[i][j].length; k++) {

                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        return 0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num. of rows : ");
        int a = sc.nextInt();
        System.out.print("Enter the num. of Column : ");
        int b = sc.nextInt();
        System.out.print("Enter the third dimension : ");
        int c = sc.nextInt();

        int[][][] arr = new int[a][b][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                for (int k = 0; k < arr[i][j].length; k++) {

                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        sort3d(arr);
    }
}
