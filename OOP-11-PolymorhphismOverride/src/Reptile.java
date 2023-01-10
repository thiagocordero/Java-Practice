
public class Reptile extends Animal {
	private String scaleColor;
	
	public String getScaleColor() {
		return scaleColor;
	}

	public void setScaleColor(String scaleColor) {
		this.scaleColor = scaleColor;
	}

	@Override
	public void move() {
		System.out.println("Crawling/Slithering");
	}

	@Override
	public void eat() {
		System.out.println("Eating insects and fish");
	}

	@Override
	public void makeSound() {
		System.out.println("Growling (most reptiles don't make any sound)");		
	}

}
