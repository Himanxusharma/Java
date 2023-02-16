package Array;

import java.util.*;
import java.io.*;

public class Merge3dArray {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the details for  matrix 1 :");
                System.out.print("Enter the num. of rows : ");
                int a = sc.nextInt();
                System.out.print("Enter the num. of Column : ");
                int b = sc.nextInt();
                System.out.print("Enter the third dimension : ");
                int c = sc.nextInt();

                int[][][] arr1 = new int[a][b][c];

                for (int i = 0; i < arr1.length; i++) {
                        for (int j = 0; j < arr1[i].length; j++) {

                                for (int k = 0; k < arr1[i][j].length; k++) {

                                        arr1[i][j][k] = sc.nextInt();
                                }
                        }
                }

                System.out.println("Enter the details for  matrix 2 :");
                System.out.print("Enter the num. of rows : ");
                int x = sc.nextInt();
                System.out.print("Enter the num. of Column : ");
                int y = sc.nextInt();
                System.out.print("Enter the third dimension : ");
                int z = sc.nextInt();
                int[][][] arr2 = new int[x][y][z];

                for (int i = 0; i < arr2.length; i++) {
                        for (int j = 0; j < arr2[i].length; j++) {

                                for (int k = 0; k < arr2[i][j].length; k++) {

                                        arr2[i][j][k] = sc.nextInt();
                                }
                        }
                }

                int p = a + x;
                int q = b + y;
                int r = c + z;

                int[][][] mergearr = new int[p][q][r];

                for (int i = 0; i < arr1.length; i++) {
                        for (int j = 0; j < arr1[i].length; j++) {

                                for (int k = 0; k < arr1[i][j].length; k++) {

                                        mergearr[i][j][k] = arr1[i][j][k];
                                }
                        }
                }

                for (int i = 0; i < arr2.length; i++) {
                        for (int j = 0; j < arr2[i].length; j++) {

                                for (int k = 0; k < arr2[i][j].length; k++) {

                                        arr2[i + a][j + b][k + c] = arr2[i][j][k];
                                }
                        }
                }

                for (int i = 0; i < mergearr.length; i++) {
                        System.out.println("Layer is : " + i);
                        for (int j = 0; j < mergearr[i].length; j++) {

                                for (int k = 0; k < mergearr[i][j].length; k++) {
                                        System.out.print(mergearr[i][j][k] + "  ");
                                }
                                System.out.println();
                        }
                        System.out.println();

                }

        }

}
