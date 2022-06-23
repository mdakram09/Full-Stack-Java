package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set3_p14 {
    public static void prime(int x){
        for(int i=2; i<x; i++){
            if(x%i==0) {
                return;
            }
        }
        System.out.print(x+" ");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter n: ");
        int n=s.nextInt();

        for(int i=0; i<=n; i++){
            prime(i);
        }
    }
}
