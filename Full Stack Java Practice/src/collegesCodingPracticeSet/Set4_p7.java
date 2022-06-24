package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set4_p7 {
    public static void main(String[] args) {
        int arr[]=new int[10];
        Scanner s = new Scanner(System.in);
        for(int i=0; i<10; i++){
            System.out.println("Enter Arr["+i+"] = ");
            arr[i]=s.nextInt();
        }
        int sum=0;
        for(int i=0; i<10; i++){
            sum+=arr[i];
        }
        System.out.println("Sum : "+sum);
    }
}
