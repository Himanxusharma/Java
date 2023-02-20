package String;
import java.lang.String;
import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {
        
        String revStr = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();

        // One Method 
        // for(var i = str.length() - 1 ; i >= 0; i--)  //reverse looop
        //     {
        //         revStr += str.charAt(i); 
        //     }

        // if(str.equalsIgnoreCase(revStr)) System.out.println("Yes, This String is palindrome. ");
        // else System.out.println("No, This String is not palindrome. ");


        //Optimized Solution
        Boolean isPalin = false;
        for(int i=0 ; i < str.length() / 2 ; i++) {
            if( str.charAt(i)==str.charAt(str.length()-i-1 )) isPalin = true;

        } 
        System.out.println("Is this String Palindrome , Condition : " + isPalin);



    }
    
}
