package arrays;

import java.util.Scanner;

public class printUnique {
    public static void unique(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < n; j++) {
                if (i != j) {
                    if (arr[i] == arr[j]) {
                        break;
                    }
                }
            }
            if (j == n) {
                System.out.println(arr[i] + " is unique");
            }
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        unique(arr);
    }
}
