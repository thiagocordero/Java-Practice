
public class Student extends Person {
	private int registration;
	private String course;
	
	public void payTuition() {
		System.out.println("Thank you for paying your tuition, " + this.getName() + "!");
	}

	
	public int getRegistration() {
		return registration;
	}
	public void setRegistration(int registration) {
		this.registration = registration;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
}
