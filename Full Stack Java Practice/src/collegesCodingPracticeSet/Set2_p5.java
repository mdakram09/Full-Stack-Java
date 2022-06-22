package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set2_p5 {
    public static int max(int a,int b, int c){
        if(a>=b && a>=c){
            return a;
        } else if (b>=a && b>=c) {
            return b;
        }
        else{
            return c;
        }
    }
    public static int min(int a,int b, int c){
        if(a<=b && a<=c){
            return a;
        } else if (b<=a && b<=c) {
            return b;
        }
        else{
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter three numbers:");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();

        System.out.println("Maximum number among these numbers is "+max(a,b,c));
        System.out.println("Minimum number among these numbers is "+min(a,b,c));
    }
}
