import java.util.Scanner;


public class fibonacci {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of terms : ");
            int n = sc.nextInt();
            int n1 = 1, n2 = 1, n3=0 ;

            for (int i = 2; i <= n+1; i++) {

                if(n==1) System.out.print("1 ");
                else if(n==2) System.out.print("1 ");
                else if (n>2)
                {
                    n3 = n1 + n2;
                    System.out.print(n1 + " ");
                    n1=n2;
                    n2=n3;
                }
                
            }
    }
    
}
