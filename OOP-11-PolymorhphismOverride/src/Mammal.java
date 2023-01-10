
public class Mammal extends Animal {
	private String furColor;
	
	public String getFurColor() {
		return furColor;
	}
	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}

	@Override
	public void move() {
		System.out.println("Walking...");
	}

	@Override
	public void eat() {
		System.out.println("Carnivorous / Herbivores");		
	}

	@Override
	public void makeSound() {
		System.out.println("Vocalizing");
	}

}
