package day_11_30_1;

public class Person {
	
	private String name, tel;
	
	// ������ -> ctrl+space -> enter
	public Person() {
	}

	// Source �޴� -> Generate Constructor using Fidlds
	public Person(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}

	// Source �޴� -> Generate Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	//������. ��� ������ ���
	public void printInfo() {
		System.out.println(name+", "+tel);
	}

}
