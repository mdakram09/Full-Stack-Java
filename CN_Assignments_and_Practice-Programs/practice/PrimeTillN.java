package practice;

import java.util.Scanner;

public class PrimeTillN {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int count = 0;

        for (int i = 2; i <= n; i++) {
            count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(i + " is prime");
            }
        }
    }
}
