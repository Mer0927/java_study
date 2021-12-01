package day_11_30_2;

public class Rect extends Shape {

	private int width;
	private int height;

	public Rect(String color, int x1, int y1, int width, int height) {
		super(color,x1,y1);
		this.width = width;
		this.height = height;
		
	}
	
	public Rect() {
	}


	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo()+", "+width+", "+height;
	}

	@Override
	public void draw() {
		System.out.println("Rect ±×¸®±â");
	}
	
}
