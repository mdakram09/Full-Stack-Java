package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set2_p7_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int marks=s.nextInt();

        switch (marks){
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
                System.out.println("O");
                break;
            default:
                System.out.println("please enter right choice");
        }
    }
}
