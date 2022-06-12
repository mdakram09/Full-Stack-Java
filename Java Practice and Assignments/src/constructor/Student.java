package constructor;

public class Student {
	String name;
	int rollNumber;
	private int fingers;
	
	
	public Student(String n) {
		this.name=n;
	}
	
	public Student(String n, int rn, int fi) {
		this.name=n;
		this.rollNumber=rn;
		this.fingers=fi;
	}
	
	
	public int getFingers() {
		return fingers;
	}
	
	public void print() {
		System.out.println(name+" "+rollNumber+" "+getFingers());
	}


	
}
