package lesson4;

public class Pen {
	// ATTRIBUTES
	public String model;
	private float point;
	private boolean capped;
	private String color;
	
	// CONSTRUCTORS
	public Pen() {
		this.cap();
		this.color = "BLUE";
	}
	
	public Pen(String color, String model, float point) {
		this.setModel(model);
		this.setPoint(point);
		this.color = color;
		this.cap();
	}
	

	// GETTERS AND SETTERS
	public String getModel() {
		return this.model;
	}
	public void setModel(String m) {
		this.model = m;		
	}
	public float getPoint() {
		return this.point;
	}
	public void setPoint(float p) {
		this.point = p;
	}
	
	// GENERAL METHODS
	public void cap() {
		this.capped = true;
	}
	
	public void uncap() {
		this.capped = false;
	}
	
	public void status() {
		System.out.println("PEN INFORMATION"); 
		System.out.println("Model: " + this.getModel());
		System.out.println("Point: " + this.getPoint());
		System.out.println("Color: " + this.color);
		System.out.println("Capped: " + this.capped);
		System.out.println();
	}
	

}
