package day_12_01_2;

public class Trans {
	
	private String 번호판;
	private String 차종;
	private int 배기량;

	public Trans(String 번호판, String 차종 , int 배기량) {
		this.번호판 = 번호판;
		this.차종 = 차종;
		this.배기량 = 배기량;
	}

	public Trans() {
	}

	public String get번호판() {
		return 번호판;
	}

	public void set번호판(String 번호판) {
		this.번호판 = 번호판;
	}

	public String get차종() {
		return 차종;
	}

	public void set차종(String 차종) {
		this.차종 = 차종;
	}

	public int get배기량() {
		return 배기량;
	}

	public void set배기량(int 배기량) {
		this.배기량 = 배기량;
	}
	
	public String getInfo() {
		return 번호판+", "+차종+", "+배기량;
	}

}
