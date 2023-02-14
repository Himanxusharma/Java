import java.lang.String;
import java.util.Scanner;
import java.lang.Math;

public class PrimeNumber {
    
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the num : ");
    int n = sc.nextInt();
    Boolean isPrime= true;

    for(int i = 2; i <= Math.sqrt(n) ; i++)
    {
        if(n==1) isPrime=true;
        if(n%i==0) isPrime=false;
    }

    System.out.println("Is " + n + " prime , Condition : " + isPrime);


    }

}
