package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set3_p21 {
    public static int factorial(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        return fact;
    }
    public static void strong(int n){
        int sum=0,x,dummy=n;
        while(n>0){
            x=n%10;
            sum+=factorial(x);
            n=n/10;
        }
        if(sum==dummy){
            System.out.println(dummy+" is a Strong Number");
        }
        else {
            System.out.println(dummy+" is not a Strong Number");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int n = s.nextInt();
        strong(n);
    }
}
