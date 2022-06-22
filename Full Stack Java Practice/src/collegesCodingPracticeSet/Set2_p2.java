package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set2_p2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        if (n > 0) {
            System.out.println("Positive");
        }
        if(n==0){
            System.out.println("Zero");
        }
        if(n<0){
            System.out.println("Negative");
        }
    }
}
