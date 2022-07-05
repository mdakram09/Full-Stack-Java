package codingNinjasPractice_String;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String");
        String str=s.nextLine();

        int count=1;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        System.out.println("Total number of words in the String is: "+count);
    }
}
