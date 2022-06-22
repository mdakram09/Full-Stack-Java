package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set2_p3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Year:");
        int year=s.nextInt();
        if(year%4==0 || year%400==0){
            System.out.println(year+" is a Leap Year");
        }
        else if(year%100==0) {
            System.out.println("Not Leap Year");
        }
        else{
            System.out.println("Not Leap Year");
        }
    }
}
