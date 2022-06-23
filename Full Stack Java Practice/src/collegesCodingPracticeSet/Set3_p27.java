package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set3_p27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int n = s.nextInt();
        int rev=0,dummy=n;
        while(n>0){
            int x=n%10;
            rev=rev*10+x;
            n=n/10;
        }
        if(rev==dummy){
            System.out.println(dummy+" is Palindrome");
        }
        else{
            System.out.println(dummy+" is Not Palindrome");
        }
    }
}
