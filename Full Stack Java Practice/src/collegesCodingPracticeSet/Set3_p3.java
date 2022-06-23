package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set3_p3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the last term: ");
        int n=s.nextInt();
        int a=0,b=1,count=2;
        System.out.print(a+" ");
        System.out.print(b+" ");
        while(count<n){
            int c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
            count++;
        }
    }
}
