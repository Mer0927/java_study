package school;

/** 학생정보를 정의하는 클래스 (VO 또는 DTO) */
public class Student {
	private String name, hakgwa;
	private int hakbun;
	
	// 생성자 메서드
	// 기본 생성자 메서드
	public Student() {
	}
	
	// 모든 변수를 받는 생성자 메서드
	public Student(String name, String hakgwa, int hakbun) {
		super();
		this.name = name;
		this.hakgwa = hakgwa;
		this.hakbun = hakbun;
	}

//	public Student(String name, int hakbun, String hakgwa) {
//		this(name, hakgwa, hakbun);
//	}
//
//	public Student(int hakbun, String name, String hakgwa) {
//		this(name, hakgwa, hakbun);	
//	}

	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHakgwa() {
		return hakgwa;
	}

	public void setHakgwa(String hakgwa) {
		this.hakgwa = hakgwa;
	}

	public int getHakbun() {
		return hakbun;
	}

	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	
	// 가지고 있는 모든 변수의 값을 출력
	public void printInfo() {
		System.out.println(name+","+hakbun+","+hakgwa);
	}

}//end class
