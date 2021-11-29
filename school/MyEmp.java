package school;

public class MyEmp extends Person {
	String dept;

	public MyEmp(String name, int no, String dept) {
		this.dept = dept;
		setName(name);
		setNo(no);
	}
	
	public void printInfo() {
		System.out.println(getName()+", "+getNo()+", "+dept);
	}
	
}
