package inheritance;

public class Car extends Vehicle{
	int seats;
	boolean roof;
	
	public void print() {
		System.out.println(wheels+" "+getDriver()+" "+getWindows()+" "+seats+" "+roof);
	}
}
