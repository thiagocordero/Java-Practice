
public class Teacher extends Person {
	//Attributes
	private String specialty;
	private float salary;
	
	//Methods
	public void raiseSalary(float raise) {
		this.salary = this.salary + raise;
	}
	
	//Getters and Setters
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

}
