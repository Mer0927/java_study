package day_11_30_2;

public class Line extends Shape {

	private int x2;
	private int y2;

	public Line(String color, int x1, int y1, int x2, int y2) {
		super(color, x1, y1); //�θ�Ŭ���� ������ �޼��� ȣ��
		this.setX2(x2);
		this.setY2(y2);
	}

	//�⺻������
	public Line() {
	}

	//getter, setter
	public int getX2() {
		return x2;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public int getY2() {
		return y2;
	}
	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	public String getInfo() {
		return super.getInfo()+", "+x2+", "+y2;
	}

}//end class
