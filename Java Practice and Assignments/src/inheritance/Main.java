package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle();
		v1.wheels=4;
		v1.setWindows(8);
		v1.setDriver(1);
		
		Car c1 = new Car();
		c1.wheels=3;
		c1.setWindows(4);
		c1.setDriver(2);
		c1.seats=8;
		c1.roof=true;
		
		v1.print();
		c1.print();
	}

}
