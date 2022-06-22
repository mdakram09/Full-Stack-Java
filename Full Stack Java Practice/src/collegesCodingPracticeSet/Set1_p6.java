package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set1_p6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of days");
        int inputDays=s.nextInt();
        int months=inputDays/30;
        int days=inputDays%30;

        System.out.println(inputDays+" days is actuallly "+months+" months and "+days+" days");
    }
}
