package day_11_30_1;

public class Person {
	
	private String name, tel;
	
	// 공백줄 -> ctrl+space -> enter
	public Person() {
	}

	// Source 메뉴 -> Generate Constructor using Fidlds
	public Person(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}

	// Source 메뉴 -> Generate Getters and Setters
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
	
	//디버깅용. 모든 변수값 출력
	public void printInfo() {
		System.out.println(name+", "+tel);
	}

}
