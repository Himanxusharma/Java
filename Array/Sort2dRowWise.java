package Array;
//row wise sorting is here

import java.io.*;
import java.util.*;

public class Sort2dRowWise {

	static int sort2d(int arr[][])
	{
		
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				for (int k = 0; k < arr[i].length - j - 1; k++) {
					if (arr[i][k] > arr[i][k + 1]) {

						int temp = arr[i][k];
						arr[i][k] = arr[i][k + 1];
						arr[i][k + 1] = temp;
					}
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}

		return 0;
	}
	public static void main(String args[])
	{
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
			
			sort2d(arr);
	}
}
