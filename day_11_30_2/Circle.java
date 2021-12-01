package day_11_30_2;

public class Circle extends Shape {

	private int radius;
	
	public Circle(String color, int x1, int y1, int radius) {
		super(color,x1,y1);
		this.radius = radius;
	}
	
	public Circle() {
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo()+","+radius;
	}
	
	@Override
	public void draw() {
		System.out.println("Circle Draw!");
	}

}
