package inheritance;

public class Vehicle {
	int wheels;
	private int windows;
	private int driver;
	
	public int getDriver() {
		return driver;
	}
	public void setDriver(int driver) {
		this.driver = driver;
	}
	public int getWindows() {
		return windows;
	}
	public void setWindows(int windows) {
		this.windows = windows;
	}
	
	public void print() {
		System.out.println(wheels+" "+getDriver()+" "+getWindows());
	}
}
