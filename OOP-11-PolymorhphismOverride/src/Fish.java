
public class Fish extends Animal {
	private String scaleColor;
	
	public void makeBubbles() {
		System.out.println("Bubbles, bubbles, bubbles...");
	}

	
	public String getScaleColor() {
		return scaleColor;
	}

	public void setScaleColor(String scaleColor) {
		this.scaleColor = scaleColor;
	}

	
	@Override
	public void move() {
		System.out.println("Swimming using fins or tails");	
	}

	@Override
	public void eat() {
		System.out.println("Eating plankton");
	}

	@Override
	public void makeSound() {
		System.out.println("Grunting");
	}

}
