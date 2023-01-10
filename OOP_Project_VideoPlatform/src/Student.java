
public class Student extends Person {
	
	//Attributes
	private String login;
	private int totalWatched;
	
	//Constructor
	public Student(String name, int age, String gender, String login) {
		super(name, age, gender);
		this.login = login;
		this.totalWatched = 0;
	}
	
	//Methods
	public void oneMoreWatched() {
		totalWatched++;
	}
	
	//Getters and Setters
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotalWatched() {
		return totalWatched;
	}
	public void setTotalWatched(int totalWatched) {
		this.totalWatched = totalWatched;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", points=" + points + ", login="
				+ login + ", totalWatched=" + totalWatched + "]";
	}
	
	
	
	

	
}
