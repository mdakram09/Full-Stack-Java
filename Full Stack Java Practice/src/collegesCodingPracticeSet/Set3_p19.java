package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set3_p19 {
    public static void Armstrong(int n){
        int sum=0,x,dummy=n;
        while(n>0){
            x = n%10;
            sum+=Math.pow(x,3);
            n=n/10;
        }
        if(sum==dummy){
            System.out.println(dummy+" is a Armstrong Number");
        }

    }

    public static void main(String[] args) {
        for(int i=0; i<=10000; i++){
            Armstrong(i);
        }
    }
}
