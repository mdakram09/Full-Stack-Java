package arrays;

import java.util.Scanner;

public class pairSum {

    public static void myPairSum(int[] arr, int sum) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + " , " + arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = s.nextInt();
        int arr[] = new int[n];

        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("enter the sum");

        int sum = s.nextInt();

        myPairSum(arr, sum);
    }

}
