package day_12_01_2;

public class Ʈ�� extends Trans {

	private int ��ⷮ;

	public Ʈ��(String ��ȣ��, String ����, int ��ⷮ, int ���緮) {
		super(��ȣ��, ����, ��ⷮ);
		this.��ⷮ = ��ⷮ;
	}
	
	public Ʈ��() {
	}

	public int get��ⷮ() {
		return ��ⷮ;
	}

	public void set��ⷮ(int ��ⷮ) {
		this.��ⷮ = ��ⷮ;
	}
	
	public String getInfo() {
		return super.getInfo()+", "+��ⷮ;
	}

}
