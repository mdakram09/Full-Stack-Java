package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set3_p24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int n = s.nextInt();
        int sum=0;
        while(n>0){
            int x=n%10;
            sum+=x;
            n=n/10;
        }
        System.out.println("Sum of Digits of the given number is: "+sum);
    }
}
