package school;

public class Mystudent extends Person {

	private String hakgwa;

	public Mystudent(String name, int no, String hakgwa) {
		this.hakgwa = hakgwa;
		setName(name);
		setNo(no);
		
	}
	
	public void printInfo() {
		System.out.println(getName()+", "+getNo()+", "+hakgwa);
	}

}
