
import java.util.Scanner;

public class MaxNum3d {

    public static void main(String[] args) {

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

        int max = arr[0][0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {

                    if (arr[i][j][k] > max) {
                        max = arr[i][j][k];

                    }
                }
            }
        }

        System.out.println("Minimum num in the array is  : " + max);

    }
}
