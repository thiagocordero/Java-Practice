
public class Employee extends Person{
	//Attributes
	private String sector;
	private boolean workingNow;
	
	//Methods
	public void clockInOrOut() {
		this.workingNow = !this.workingNow;		
	}
	
	//Geters and Setters
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}

	public boolean getWorkingNow() {
		return workingNow;
	}
	public void setWorkingNow(boolean workingNow) {
		this.workingNow = workingNow;
	}
	
	

}
