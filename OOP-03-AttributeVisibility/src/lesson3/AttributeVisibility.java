package lesson3;

public class AttributeVisibility {

	public static void main(String[] args) {
		Pen p1 = new Pen();
		p1.model = "BIC CRYSTAL";
		p1.color = "BLACK";
		p1.inkLevel = 80;
		// The field "ballpointTip" is not visible: p1.ballpointTip = 0.5
		p1.uncapPen();
		p1.scribble();	
		p1.write();
		p1.draw();
	}

}
