
public class Student extends Person {
	
	//Attributes
	private int registrationNumber;
	private String course;
	
	//Methods
	public void dropCourse() {
		System.out.println("Your enrollment will be canceled!");
	}
	
	//Getters and Setters
	public int getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	
	
	

}
