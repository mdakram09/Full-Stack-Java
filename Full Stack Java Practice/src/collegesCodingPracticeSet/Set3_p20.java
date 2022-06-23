package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set3_p20 {
    public static void perfect(int n){
        int sum=0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println(n+" is a Perfect Number");
        }
        else{
            System.out.println(n+" is not a Perfect Number");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int n = s.nextInt();
        perfect(n);
    }
}
