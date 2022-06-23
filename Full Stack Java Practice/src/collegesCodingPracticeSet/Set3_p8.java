package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set3_p8 {
    public static double fact(double n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the last term: ");
        int n=s.nextInt();
        double count=1;
        double sum=0.0;
        while(count<=n){
            sum= sum+ (1/(fact(count)));
            count++;
        }
//        System.out.println(fact(5));
        System.out.println("Sum: "+sum);
    }
}
