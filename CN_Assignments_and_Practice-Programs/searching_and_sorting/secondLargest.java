import java.util.Scanner;

public class secondLargest {

    public static void secondLarg(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        int secondLarg = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                secondLarg = max;
                max = arr[i];
            } else if (arr[i] > secondLarg && arr[i] != max) {
                secondLarg = arr[i];
            }
        }
        System.out.println("second " + secondLarg);
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

        secondLarg(arr);
    }
}
