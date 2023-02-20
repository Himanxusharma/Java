package String;

import java.util.Scanner;

public class spaceCount {

    private static final String StringUtils = null;
    private static final String INPUT_STRING = null;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String space = sc.nextLine();
        // String space ="Hello to the new world.";
        int count = 0;
        // char[] ch = space.toCharArray();
        // for (int i = 0; i < ch.length; i++) {

        //     if (ch[i] == ' ') {
        //         count++;

        //     }

        // }

        int i = 0;
        while (i < space.length()) {
            char ch = space.charAt(i);
            if (ch == ' ') {
                count++;
            }
            i++;
        }
        System.out.println(space + " : " + count);
    }

}
