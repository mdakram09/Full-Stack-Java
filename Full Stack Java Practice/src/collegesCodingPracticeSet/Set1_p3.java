package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set1_p3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter temperature in Fahrenheit: ");
        float f=s.nextFloat();
        float c=(float) ((f-32)/9)*5;
        System.out.println("Temperature is Centigrade is: "+c);
    }
}
