package day_12_01_2;

public class 트럭 extends Trans {

	private int 배기량;

	public 트럭(String 번호판, String 차종, int 배기량, int 적재량) {
		super(번호판, 차종, 배기량);
		this.배기량 = 배기량;
	}
	
	public 트럭() {
	}

	public int get배기량() {
		return 배기량;
	}

	public void set배기량(int 배기량) {
		this.배기량 = 배기량;
	}
	
	public String getInfo() {
		return super.getInfo()+", "+배기량;
	}

}
