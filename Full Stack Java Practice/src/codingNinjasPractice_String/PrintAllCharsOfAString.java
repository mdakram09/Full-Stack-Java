package codingNinjasPractice_String;

import java.util.Scanner;

public class PrintAllCharsOfAString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String");
        String str=s.nextLine();
        System.out.println("String: "+str);

        for(int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }
}
