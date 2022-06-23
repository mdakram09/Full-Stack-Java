package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set3_p4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the last term: ");
        int n=s.nextInt();
        int a=0,b=1,c=2,count=3;
        System.out.print(a+" ");
        System.out.print(b+" ");
        System.out.print(c+" ");
        while(count<n){
            int d=a+b+c;
            a=b;
            b=c;
            c=d;
            System.out.print(d+" ");
            count++;
        }
    }
}
