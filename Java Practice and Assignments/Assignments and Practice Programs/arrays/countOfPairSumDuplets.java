package arrays;

import java.util.Scanner;

public class countOfPairSumDuplets {
    public static int duplets(int[] arr, int sum) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == sum) {
                    count++;
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
        System.out.println("Number of duplets are " + duplets(arr, sum));
    }
}
