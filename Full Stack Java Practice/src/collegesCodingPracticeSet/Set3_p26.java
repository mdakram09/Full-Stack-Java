package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set3_p26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int n = s.nextInt();
        int rev=0;
        while(n>0){
            int x=n%10;
            rev=rev*10+x;
            n=n/10;
        }
        System.out.println("Reverse of the given number is: "+rev);
    }
}
