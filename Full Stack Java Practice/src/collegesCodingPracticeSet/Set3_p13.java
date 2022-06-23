package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set3_p13 {
    public static String prime(int n){
        for(int i=2; i<n; i++){
            if(n%i==0){
                System.out.println();
               return "Not a Prime Number";
            }
        }
        return "Prime Number";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int n=s.nextInt();
        System.out.println(prime(n));
    }
}
