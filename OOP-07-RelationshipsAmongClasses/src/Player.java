
public class Player {
	
	//Attributes
	private String name;
	private String nationality;
	private int age;
	private float height;
	private float weight;
	private String category;
	private int victories, defeats, ties;
	
	// Constructor
	public Player(String name, String nationality, int age, float height, 
					float weight, int wins, int losses, int draws) {
		this.name = name;
		this.nationality = nationality;
		this.age = age;
		this.height = height;
		this.setWeight(weight);
		this.victories = wins;
		this.defeats = losses;
		this.ties = draws;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
		this.setCategory();
	}
	public String getCategory() {
		return category;
	}
	private void setCategory() {
		if(this.getWeight() < 61.2) {
			this.category = "Invalid";			
		} else if(this.getWeight() < 65.8) {
			this.category = "Featherweight";			
		} else if (this.getWeight() <= 70.3) {
			this.category = "Lightweight";
		} else if (this.getWeight() <= 83.9) {
			this.category = "Middleweight";
		} else if (this.getWeight() <= 120.2) {
			this.category = "Heavyweight";		
		} else {
			this.category = "Invalid";
		}
		
	}
	public int getVictories() {
		return victories;
	}
	public void setVictories(int victories) {
		this.victories = victories;
	}
	public int getDefeats() {
		return defeats;
	}
	public void setDefeats(int defeats) {
		this.defeats = defeats;
	}
	public int getTies() {
		return ties;
	}
	public void setTies(int ties) {
		this.ties = ties;
	}
	
	
	// General Methods
	
	public void presentation() {
		System.out.println("Ladies and gentlemen, let's meet our next player: " + this.getName());
		System.out.println("Competing in the " + this.getCategory() + " category!");
		System.out.printf("Having a record of " 
							+ this.getVictories() + " victories, " 
							+ this.getDefeats() + " defeats and " 
							+ this.getTies() + " ties.\n");	
	}
	
	public void status() {
		System.out.println("---------------------------------");
		System.out.println("Player: " + this.getName());
		System.out.println("Category: " + this.getCategory());
		System.out.println("Victories: " + this.getVictories());
		System.out.println("Defeats: " + this.getDefeats());
		System.out.println("Ties: " + this.getTies());
		System.out.println("---------------------------------");
	}
	
	public void win() {
		this.setVictories(this.getVictories() + 1);
	}
	public void lose() {
		this.setDefeats(this.getDefeats() + 1);		
	}
	public void draw() {
		this.setTies(this.getTies() + 1);
	}	

}
