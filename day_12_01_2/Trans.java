package day_12_01_2;

public class Trans {
	
	private String ��ȣ��;
	private String ����;
	private int ��ⷮ;

	public Trans(String ��ȣ��, String ���� , int ��ⷮ) {
		this.��ȣ�� = ��ȣ��;
		this.���� = ����;
		this.��ⷮ = ��ⷮ;
	}

	public Trans() {
	}

	public String get��ȣ��() {
		return ��ȣ��;
	}

	public void set��ȣ��(String ��ȣ��) {
		this.��ȣ�� = ��ȣ��;
	}

	public String get����() {
		return ����;
	}

	public void set����(String ����) {
		this.���� = ����;
	}

	public int get��ⷮ() {
		return ��ⷮ;
	}

	public void set��ⷮ(int ��ⷮ) {
		this.��ⷮ = ��ⷮ;
	}
	
	public String getInfo() {
		return ��ȣ��+", "+����+", "+��ⷮ;
	}

}
