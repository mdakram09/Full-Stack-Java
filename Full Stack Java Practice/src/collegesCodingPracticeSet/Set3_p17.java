package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set3_p17 {
    public static void Armstrong(int n){
        int sum=0,x,dummy=n;
        while(n>0){
            x = n%10;
            sum+=Math.pow(x,3);
            n=n/10;
        }
        if(sum==dummy){
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not Armstrong");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int n = s.nextInt();
        Armstrong(n);
    }
}
