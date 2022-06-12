import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("enter element to find");
        int x = s.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println(x + " is present at " + i + "th index");
            }
        }
    }
}
