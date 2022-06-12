package oops;

public class StudentUse {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Akram";
        s1.rollNumber=55;
        s1.age=22;
        s1.isGood=true;
        s1.setEnglishmarks(81);
        s1.setMathMarks(52);

        System.out.println(s1.name);
        System.out.println(s1.rollNumber);
        System.out.println(s1.age);
        System.out.println(s1.isGood);
        System.out.println(s1.getEnglishmarks());
        System.out.println(s1.getMathMarks());
    }
}
