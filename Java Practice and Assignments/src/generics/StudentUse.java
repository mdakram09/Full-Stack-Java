package generics;

public class StudentUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student<String, Integer> s1= new Student<>();
		
		s1.setName("Akram Khan");
		s1.setRollNumber(55);
		
		System.out.println(s1.getName());
		System.out.println(s1.getRollNumber());
	}

}
