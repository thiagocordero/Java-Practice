
public class OverrideMain {

	public static void main(String[] args) {
		
		Mammal m = new Mammal();
		// Reptile r = new Reptile();
		// Fish f = new Fish();
		// Bird b = new Bird();
		
		Kangaroo k = new Kangaroo();
		// Turtle t = new Turtle();
		// Goldfish gf = new Goldfish();
		// Arara a = new Arara();
		
		m.setWeight(35.3f);
		m.setFurColor("Brown");
		m.eat();
		m.move();
		m.makeSound();
		
		k.move();
		
	
		
		

	}

}
