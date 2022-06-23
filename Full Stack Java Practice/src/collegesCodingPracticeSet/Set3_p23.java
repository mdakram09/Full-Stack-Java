package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set3_p23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int n = s.nextInt();
        int count=0;
        while(n>0){
            int x=n%10;
            count++;
            n=n/10;
        }
        System.out.println("Total digits of the given number is: "+count);
    }
}
