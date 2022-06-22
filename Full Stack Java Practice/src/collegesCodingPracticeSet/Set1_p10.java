package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set1_p10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the 3 numbers one by one");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a>=b && a>=c){
            System.out.println(a+" is the largest number");
        }
        else if(b>=a && b>=c){
            System.out.println(b+" is the largest number");
        }
        else {
            System.out.println(c+" is the largest number");
        }
    }
}
