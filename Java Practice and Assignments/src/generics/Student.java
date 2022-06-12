package generics;

public class Student<T,V> {
	private T name;
	private V rollNumber;
	
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public V getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(V rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	
}
