
public class Inheritance {

	public static void main(String[] args) {
		Person p1 = new Person();
		Student p2 = new Student();
		Teacher p3 = new Teacher();
		Employee p4 = new Employee();
		
		//Inherited Attributes
		p1.setName("Peter");
		p2.setName("Thiago");
		p3.setName("Tiger");
		p4.setName("Peterson");
		
		p1.setGender("Male");
		p2.setAge(27);
		p3.setGender("Non-Binary");
		p4.setAge(18);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		//Specific Attributes
		p2.setCourse("Computer Science");
		p3.setSalary(5000);
		p4.setSector("Sales");

	}

}