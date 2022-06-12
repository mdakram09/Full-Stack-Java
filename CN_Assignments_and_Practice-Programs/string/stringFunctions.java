import java.util.Scanner;

public class stringFunctions {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the string1");
        String str = s.nextLine();
        System.out.println("enter the string2");
        String str2 = s.nextLine();

        System.out.println(str.contains("khan"));
        System.out.println(str.indexOf("khan"));
        System.out.println(str.indexOf("a", 5));
        System.out.println(str2.concat(str));
        System.out.println(str2);
        System.out.println(str.charAt(2));
        System.out.println(str.equals(str2));

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
