import java.util.Scanner;
public class StringReverse {

        public static void main(String[] args) {
            
            String revStr = "";
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string : ");
            String str = sc.nextLine();
            //System.out.println(str.length());

            for(var i = str.length() - 1 ; i >= 0; i--)  //reverse looop
            {
                revStr += str.charAt(i); //Take the char one by one at the index i.
            }

            System.out.println(revStr);

        }
    
}
