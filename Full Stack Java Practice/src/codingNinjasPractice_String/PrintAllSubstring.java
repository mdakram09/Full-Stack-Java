package codingNinjasPractice_String;

import java.util.Scanner;

public class PrintAllSubstring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String");
        String str=s.nextLine();
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}
