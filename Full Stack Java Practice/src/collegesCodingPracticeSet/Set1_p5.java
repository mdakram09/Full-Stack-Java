package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set1_p5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter length of 3 sides of the triangle one by one: ");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        float st=(float) (a+b+c)/2;
        float area= (float)(Math.sqrt(st*(st-a)*(st-b)*(st-c)));
        System.out.println("Area of the Triangle is: "+area);
    }
}
