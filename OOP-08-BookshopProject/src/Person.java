
public class Person {
	//Attributes
	private String name;
	private int age;
	private String gender;
	
	// Methods
	public void birthday() {
		this.age++;		
	}
	
	//Constructor	
	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}



	//Getters e Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	//
	
	
	
	
	

}
