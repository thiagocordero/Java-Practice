package lesson2;

public class ClassesAndObjects {

	public static void main(String[] args) {
		Pen p1 = new Pen();
		p1.color = "BLUE";
		p1.ballpointTip = 0.5f;
		p1.capped = true;
		p1.model = "BIC";
		p1.inkLevel = 100;
		
		Pen p2 = new Pen();
		p2.color = "RED";
		p2.ballpointTip = 0.7f;
		p2.capped = true;
		p2.model = "BIC";
		p2.inkLevel = 100;
		
		
		p1.scribble();
		p1.status();
		
		p2.uncapPen();
		p2.scribble();
		p2.status();
	}

}
