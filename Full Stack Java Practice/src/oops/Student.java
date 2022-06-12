package oops;

public class Student {
    String name;
    int rollNumber;
    int age;
    boolean isGood;

    private int mathMarks;
    private int englishmarks;

    public int getMathMarks() {
        return mathMarks;
    }

    public void setMathMarks(int mathMarks) {
        this.mathMarks = mathMarks;
    }

    public int getEnglishmarks() {
        return englishmarks;
    }

    public void setEnglishmarks(int englishmarks) {
        this.englishmarks = englishmarks;
    }
}
