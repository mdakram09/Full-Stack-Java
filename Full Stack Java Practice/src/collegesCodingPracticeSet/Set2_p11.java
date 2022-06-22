package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set2_p11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char c = s.next().charAt(0);

        switch (c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("not Vowel");
                break;
        }
    }
}
