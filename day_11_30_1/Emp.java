package day_11_30_1;

public class Emp extends Person {

	private String dept;

	public Emp(String name, String tel, String dept) {
		super(name, tel);
		this.dept = dept;
		
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void printInfo() {
		System.out.println(getName()+", "+getTel()+", "+dept);
	}

}//end class
