package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set1_p8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        int rev=0, dummy=n;
        while(n>0){
            int x=n%10;
            rev=rev*10+x;
            n=n/10;
        }
        if(dummy==rev){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
