package arrays;

import java.util.Scanner;

public class tripletSum {

    public static int countOfTriplets(int[] arr, int sum) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == sum) {
                        count++;
                    }
                }
            }
        }

        return count;
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

        System.out.println("Number of triplets are " + countOfTriplets(arr, sum));
    }
}
