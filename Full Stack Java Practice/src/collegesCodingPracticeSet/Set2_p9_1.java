package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set2_p9_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = s.nextInt();
        System.out.println("Enter the second number: ");
        int b=s.nextInt();
        int ans=0;
        System.out.println("Enter the operation type among +,-,*,/,% : ");
        char c=s.next().charAt(0);

        if(c=='+'){
            ans=a+b;
        }if(c=='-'){
            ans=a-b;
        }if(c=='*'){
            ans=a*b;
        }if(c=='/'){
            ans=a/b;
        }if(c=='%'){
            ans=a%b;
        }
        else {
            System.out.println("Enter correct operation");
        }

        System.out.println("Answer is: "+ans);

    }
}
