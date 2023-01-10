
public abstract class Animal {
	//Attributes
	protected float weight;
	protected int age;
	protected int legs;
	
	//Methods
	public abstract void move();
	public abstract void eat();
	public abstract void makeSound();
	public float getWeight() {
		return weight;
	}
	
	//Getters and Setters
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	
	

	
	

}
