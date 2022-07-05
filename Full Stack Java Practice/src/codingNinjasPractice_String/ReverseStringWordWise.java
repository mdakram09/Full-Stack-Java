package codingNinjasPractice_String;

import java.util.Scanner;

public class ReverseStringWordWise {
    public static void revString(String[] str){
        for(int i=str.length-1; i>=0; i--){
            System.out.print(str[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String");
        String str[]=s.nextLine().split(" ");
        revString(str);
    }
}
