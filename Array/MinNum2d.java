package Array;
import java.util.Scanner;

public class MinNum2d {

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the num. of rows : ");
    int a = sc.nextInt();
    System.out.println("Enter the num. of Column : ");
    int b = sc.nextInt();

    int[][] arr = new int[a][b];
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {

            arr[i][j] = sc.nextInt();
        }
    }
    
    int min = arr[0][0];
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            
            if( arr[i][j] < min)
            {
                min = arr[i][j];

            }
        }
    }

    System.out.println("Minimum num in the array is  : " + min );

}
}
