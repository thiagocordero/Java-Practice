package lesson2;

public class Pen {
	String model;
	String color;
	float ballpointTip;
	int inkLevel;
	boolean capped;																																				
	
	void status() {
		System.out.println("This is a " + this.color + " pen");
		System.out.println("What is the model? " + this.model);
		System.out.println("What is the ballpointTip? " + this.ballpointTip);
		System.out.println("Is it capped? " + this.capped);		
		System.out.println("inkLevel: " + this.inkLevel);
		System.out.println(" ");
	}
	
	void scribble() {
		if(this.capped == true) {
			System.out.println("OOPS... you can't scribble with a capped pen. \n");			
		} else {
			System.out.println("You are SCRIBBLING now! \n");
			this.inkLevel -= 1;
		}
	}
	
	void capPen() {
		this.capped = true;
	}
	
	void uncapPen() {
		this.capped = false;
	}
	
	void write() {
		if(this.capped == true) {
			System.out.println("OOPS... you can't scribble with a capped pen. \n");			
		} else {
			System.out.println("You are WRITING now! \n");
			this.inkLevel -= 3;
		}
	}
	
	void draw() {
		if(this.capped == true) {
			System.out.println("OOPS... you can't scribble with a capped pen. \n");			
		} else {
			System.out.println("You are DRAWING now! \n");
			this.inkLevel -= 5;
		}
	}

}
