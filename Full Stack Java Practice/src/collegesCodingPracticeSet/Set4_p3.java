package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set4_p3 {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner s = new Scanner(System.in);
        for(int i=0; i<5; i++){
            System.out.println("Enter Arr["+i+"] = ");
            arr[i]=s.nextInt();
        }

        for(int i=0; i<5; i++){
            System.out.println("Arr["+i+"] = "+Math.pow(arr[i],2));
        }
    }
}
