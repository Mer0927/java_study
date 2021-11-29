package school;

public class Emp {
	private String name, dept;
	private int sabun;
	
	public Emp() {
	}

	public Emp(String name, String dept, int sabun) {
		super();
		this.name = name;
		this.dept = dept;
		this.sabun = sabun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setBDept(String dept) {
		this.dept = dept;
	}

	public int getSabun() {
		return sabun;
	}

	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	
	public void printInfo() {
		System.out.println(name+","+sabun+","+dept);
	}
	
}
