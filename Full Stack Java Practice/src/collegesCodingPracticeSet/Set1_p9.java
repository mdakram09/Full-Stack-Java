package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set1_p9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int n=s.nextInt();
        if(n<0){
            n*=-1;
            System.out.println("Absolute value of the given number is: "+n);
        }
        else{
            System.out.println("Absolute value of the given number is: "+n);
        }
    }
}
