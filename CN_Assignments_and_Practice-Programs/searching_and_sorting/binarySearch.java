import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("enter element to find");
        int x = s.nextInt();
        int start = 0;
        int end = n - 1;
        // int mid = 0;
        int mid = (start + end) / 2;

        while (start <= end) {

            if (arr[mid] == x) {
                System.out.println("element found at index " + mid);
                break;
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
    }
}
