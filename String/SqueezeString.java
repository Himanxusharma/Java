package String;

import java.util.Scanner;

public class SqueezeString {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        // String space ="Hello to the new world.";
        // System.out.println(space.replaceAll("", ""));
        // System.out.println(space.replaceAll("\\s", ""));

        char[] ch = str.toCharArray();  
        StringBuffer nospace = new StringBuffer();  
        for (int i = 0; i < ch.length; i++) {  
            if ((ch[i] != ' ') && (ch[i] != '\t') && (ch[i] != '\n')) {  
                nospace.append(ch[i]);  
            }  
        }  
        String noSpaceStr2 = nospace.toString();  
        System.out.println(noSpaceStr2);  
    }



}
