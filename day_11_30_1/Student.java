package day_11_30_1;

public class Student extends Person {

	private String hakgwa;

	public Student(String name, String tel, String hakgwa) {
		//name�� tel�� �θ�Ŭ������ �Ѱ���(2���� > set �޼���, �θ������ �޼���)
		super(name, tel); //<������ �޼��忡���� ȣ��. �ƴѰ����� �θ��� �����߻�.
		this.hakgwa = hakgwa;
	}

	public String getHakgwa() {
		return hakgwa;
	}

	public void setHakgwa(String hakgwa) {
		this.hakgwa = hakgwa;
	}
	
	@Override
	public void printInfo() {
		System.out.println(getName()+", "+getTel()+", "+hakgwa);
	}

}//end class
