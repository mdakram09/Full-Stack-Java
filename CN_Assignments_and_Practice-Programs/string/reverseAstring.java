import java.util.Scanner;

public class reverseAstring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String revStr = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            revStr = ch + revStr;
        }
        System.out.println(revStr);
    }
}
