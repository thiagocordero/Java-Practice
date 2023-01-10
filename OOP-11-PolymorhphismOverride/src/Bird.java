
public class Bird extends Animal {
	private String featherColor;

	public String getFeatherColor() {
		return featherColor;
	}
	public void setFeatherColor(String featherColor) {
		this.featherColor = featherColor;
	}
	
	public void buildNest() {
		System.out.println("Building a nest");
	}

	@Override
	public void move() {
		System.out.println("Flying");
	}

	@Override
	public void eat() {
		System.out.println("Eating insects");
	}

	@Override
	public void makeSound() {
		System.out.println("Tweeting");
		
	}

}
