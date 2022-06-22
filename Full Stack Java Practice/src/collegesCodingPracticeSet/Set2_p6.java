package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set2_p6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter values of a,b and c one by one:");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        float root1=0f;
        float root2=0f;

        float d=(float) (Math.pow(b,2)-4*a*c);
        if(d==0){
            System.out.println("Roots are real and equal");
            root1=(float) (-b/(2*a));
        }
        else if(d>0){
            System.out.println("Roots are real and unequal");
            root1=(float) ((-b+Math.sqrt(d))/(2*a));
            root2=(float) ((-b-Math.sqrt(d))/(2*a));
        }
        else{
            System.out.println("Roots are imaginary");
            root1=(float) ((-b+Math.sqrt(d))/(2*a));
            root2=(float) ((-b-Math.sqrt(d))/(2*a));
        }

        System.out.println("root1: "+root1);
        System.out.println("root2: "+root2);
    }
}
