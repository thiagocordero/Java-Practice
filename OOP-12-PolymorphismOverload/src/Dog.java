
public class Dog extends Wolf {
	
	@Override
	public void makeSound() {
		System.out.println("Woof, woof, woof!");	
	}
	
	public void react(String sentence) {
		if (sentence.equals("Hey you!") || sentence.equals("Food")) {
			System.out.println("Wag tail!");
		} else {
			System.out.println("Growl!");
		}
	}
	
	public void react(int hourOfTheDay, boolean isOwner) {
		if  (isOwner) {
			System.out.println("Wag tail!");
		} else {
			if (hourOfTheDay < 12) {
				System.out.println("Ignore");
			} else {
				System.out.println("Bark");
			}
		}
		
	}
	
	public void react(boolean isOwner) {
		if (isOwner) {
			System.out.println("Wag tail!");
		} else {
			System.out.println("Growl and bark!");
		}
	}
	
	public void react(int age, float weight) {
		
		if (age<5) {
			
			if (weight < 10) {
				System.out.println("Wag tail");
			} else {
				System.out.println("Bark!");
			}
			
		} else {
			
			if (weight < 10) {
				System.out.println("Growl");
			} else {
				System.out.println("Ignore");
			}
			
		}
		
	}
}
