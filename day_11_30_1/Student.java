package day_11_30_1;

public class Student extends Person {

	private String hakgwa;

	public Student(String name, String tel, String hakgwa) {
		//name과 tel은 부모클래스로 넘겨줌(2가지 > set 메서드, 부모생성자 메서드)
		super(name, tel); //<생성자 메서드에서만 호출. 아닌곳에서 부르면 오류발생.
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
