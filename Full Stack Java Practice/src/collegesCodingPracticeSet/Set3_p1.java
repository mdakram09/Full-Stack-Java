package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set3_p1 {
    public static double myPow(int x,int n){
        double ans=1;
        for (int i=0; i<n; i++){
            ans*=x;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x=s.nextInt();
        System.out.println("Enter the power: ");
        int n=s.nextInt();

        System.out.println("Value of "+x+" with power "+n+" is : "+myPow(x,n));
        System.out.println("With pow function: "+Math.pow(x,n));
    }
}
