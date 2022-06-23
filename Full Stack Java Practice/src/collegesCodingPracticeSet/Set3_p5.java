package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set3_p5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the last term: ");
        int n=s.nextInt();
        int count=0,sum=0;
        while(count<n*2){
            if(count%2!=0){
                sum+=count;
            }
            count++;
        }
        System.out.println("Sum: "+sum);
    }
}
