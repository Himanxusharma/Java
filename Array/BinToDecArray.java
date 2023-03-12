
import java.util.*;

public class BinToDecArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Arary : ");
        int n = sc.nextInt();
        System.out.println("Enter the Elements in the binary form below : ");
        int[] bin = new int[n];
        for (int i = 0; i < n; i++) {
            bin[i] = sc.nextInt();
        }

        int decimal = 0;
        for (int i = 0; i < n; i++) {
            decimal = decimal * 2 + bin[i];
        }

        System.out.println("Decimal value of the array : " + decimal);

    }

}
