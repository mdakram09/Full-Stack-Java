package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set1_p2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle: ");
        int l=s.nextInt();
        System.out.println("Enter the bredth of the rectangle: ");
        int b=s.nextInt();
        System.out.println("Enter the radius of the circle: ");
        int r=s.nextInt();

        int area=l*b;
        System.out.println("Area of the rectangle is: "+area);
        int perimeter = 2*(l+b);
        System.out.println("Perimeter of the circle is: "+perimeter);
        float Carea=(float) (Math.PI*Math.pow(r,2));
        System.out.println("Area of the circle is: "+Carea);
        float circumference = (float)( 2*Math.PI*r);
        System.out.println("Circumference of the circle is: "+circumference);
    }
}
