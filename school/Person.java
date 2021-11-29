package school;

/** 학생과 직원 공통변수를 정의하는 용도 */
public class Person {

	private String name;
	private int no;

	public Person(String name, int no) {
		this.name = name;
		this.no = no;
		
	}
	
	//기본생성자 메서드
	public Person() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	
	public void printInfo() {
		System.out.println(name+","+no);
	}
	
	
}
