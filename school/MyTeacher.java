package school;

public class MyTeacher extends Person {
	
	String lab;

	public MyTeacher(String name, int no, String lab) {
		this.lab = lab;
		setName(name);
		setNo(no);
	}
	
	public void printInfo() {
		System.out.println(getName()+", "+getNo()+", "+lab);
	}

}
