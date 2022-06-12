package oops;

public class Calculator {
	private int a,b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public void print() {
		System.out.println(a+" "+b);
	}
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void substract() {
		System.out.println(a-b);
	}
	public void multiply() {
		System.out.println(a*b);
	}
	public void divide() {
		if(b==0) {
			System.out.println("denominator is zero");
		}
		else {
			System.out.println(a/b);
		}
	}
}
