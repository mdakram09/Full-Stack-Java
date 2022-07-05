package codingNinjasPractice_String;

import java.util.Locale;
import java.util.Scanner;

public class StringFunctions {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String 1: ");
        String str1=s.nextLine();
        System.out.println("Enter String 2: ");
        String str2=s.nextLine();

        System.out.println(str1.contains("a"));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.concat(str2));
        System.out.println(str1.indexOf("a"));
        System.out.println(str1.substring(1,4));
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.isEmpty());
        System.out.println(str1.length());
    }
}
