package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set3_p6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the last term: ");
        int n=s.nextInt();
        double count=1;
        double sum=0.0;
        while(count<=n){
            sum= sum+ (1/count);
            count++;
        }
        System.out.println("Sum: "+sum);
    }
}
