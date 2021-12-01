package day_11_30_2;

abstract public class Shape {

	private String color;
	private int x1;
	private int y1;

	public Shape(String color, int x1, int y1) {
		this.color = color;
		this.x1 = x1;
		this.y1 = y1;
	}
	
	//기본 생성자 메서드
	public Shape() {
	}
	
	//getter, setter
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public int getY1() {
		return y1;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	
	//현재 모든 변수정보 제공
	public String getInfo() {
		return color+", "+x1+", "+y1;
	}
	
	//필수구현 메서드
	abstract public void draw();

}//end class
