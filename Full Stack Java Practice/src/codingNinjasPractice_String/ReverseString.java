package codingNinjasPractice_String;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String");
        String str=s.nextLine();
        String temp=str;
        String rev=" ";
        for(int i=0; i<str.length(); i++){
            rev=str.charAt(i)+rev;
        }
        System.out.println("Reverse of "+temp+" is: "+rev);
    }
}
