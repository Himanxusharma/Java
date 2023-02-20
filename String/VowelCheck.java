package String;
import java.util.Scanner;
import java.lang.String;

public class VowelCheck {
    
        public static void main(String[] args) {
            
        
        String Str = "";
         Boolean isVowel = false;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string : ");
            String str = sc.nextLine();
            //System.out.println(str.length());tr

            for(int i = 0 ; i < str.length(); i++)  //reverse looop
            {
                if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u' || str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U') 
                {
                    isVowel = true; 
                    break; //Wil break the loop after find any vowel
                }
            }


            System.out.println("Is there any Vowel, Condition : " + isVowel);
        }
    }