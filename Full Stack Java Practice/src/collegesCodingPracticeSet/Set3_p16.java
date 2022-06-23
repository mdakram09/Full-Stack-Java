package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set3_p16 {
    public static boolean prime(int n){
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void primeFactor(int n){
        for(int i=2; i<n; i++){
            if(n%i==0){
                if(prime(i)){
                    System.out.println("Prime Factor of "+n+" is "+i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int n = s.nextInt();
        primeFactor(n);
    }
}
