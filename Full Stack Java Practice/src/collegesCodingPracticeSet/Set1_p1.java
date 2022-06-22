package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set1_p1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your basic salary");
        float basic = s.nextFloat();
        float DA = (float) (74.0/100.0)*basic;
        System.out.println("DA = "+DA);
        float HRA = (float)(15.0/100.0)*basic;
        System.out.println("HRA = "+HRA);
        float gross=(float)(basic+DA+HRA);
        System.out.println("Your Gross Salary is "+gross);
    }
}
