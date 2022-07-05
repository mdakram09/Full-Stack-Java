package codingNinjasPractice_String;

import java.util.Scanner;

public class ReverseEachWord {
    public static void reverseEachWord(String str){
        String rev="";
        for(int i=0; i<str.length(); i++){
            rev=str.charAt(i)+rev;
        }
        System.out.print(rev+" ");
    }
    public static void revString(String[] str){
        for(int i=0; i<str.length; i++){
            reverseEachWord(str[i]);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String");
        String str[]=s.nextLine().split(" ");
        revString(str);
    }
}
