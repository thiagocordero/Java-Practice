
public class OverloadMain {

	public static void main(String[] args) {
		Dog d = new Dog();
		
		d.react("Hey you!");
		d.react("Bad boy!");
		d.react(11, false);
		d.react(11, true);
		d.react(true);
		d.react(false);
		d.react(2, 12.5f);
		d.react(17, 4.5f);
		
		

	}

}
